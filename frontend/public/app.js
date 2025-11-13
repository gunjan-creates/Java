(() => {
  const treeContainer = document.getElementById('tree');
  const editor = document.getElementById('editor');
  const fileTitle = document.getElementById('file-title');
  const saveBtn = document.getElementById('save-btn');
  const statusEl = document.getElementById('status');
  const refreshBtn = document.getElementById('refresh-btn');
  const directoryTemplate = document.getElementById('template-directory');
  const fileTemplate = document.getElementById('template-file');

  let currentPath = null;
  let originalContent = '';
  let activeFileButton = null;

  function setStatus(message, variant = 'info') {
    statusEl.textContent = message || '';
    statusEl.dataset.variant = variant;
  }

  function setActiveFileButton(button) {
    if (activeFileButton) {
      activeFileButton.classList.remove('active');
    }
    activeFileButton = button || null;
    if (activeFileButton) {
      activeFileButton.classList.add('active');
    }
  }

  function expandToPath(path) {
    if (!path) {
      return;
    }

    const segments = path.split('/');
    if (segments.length < 2) {
      return;
    }

    let prefix = '';
    for (let i = 0; i < segments.length - 1; i += 1) {
      const segment = segments[i];
      prefix = prefix ? `${prefix}/${segment}` : segment;
      treeContainer.querySelectorAll('details').forEach((details) => {
        if (details.dataset.path === prefix) {
          details.open = true;
        }
      });
    }
  }

  async function safeJson(response) {
    const text = await response.text();
    try {
      return JSON.parse(text);
    } catch (error) {
      return text;
    }
  }

  function renderDirectory(node) {
    const details = directoryTemplate.content.firstElementChild.cloneNode(true);
    const summary = details.querySelector('summary');
    const childrenContainer = details.querySelector('.children');

    summary.textContent = node.path ? node.name : node.name || 'root';
    details.dataset.path = node.path;
    details.open = node.path === '';

    node.children.forEach((child) => {
      if (child.type === 'directory') {
        childrenContainer.appendChild(renderDirectory(child));
      } else {
        childrenContainer.appendChild(renderFile(child));
      }
    });

    return details;
  }

  function renderFile(node) {
    const button = fileTemplate.content.firstElementChild.cloneNode(true);
    button.textContent = node.name;
    button.dataset.path = node.path;
    button.addEventListener('click', () => openFile(node.path, button));
    return button;
  }

  async function loadTree(selectedPath = null) {
    treeContainer.innerHTML = '<p>Loading directory tree...</p>';
    try {
      const response = await fetch('/api/tree');
      const payload = await safeJson(response);
      if (!response.ok) {
        throw new Error(payload?.error || `Unable to retrieve tree (status ${response.status})`);
      }

      treeContainer.innerHTML = '';
      const treeRoot = renderDirectory(payload);
      treeContainer.appendChild(treeRoot);

      if (selectedPath) {
        expandToPath(selectedPath);
        const buttons = treeContainer.querySelectorAll('.file');
        buttons.forEach((button) => {
          if (button.dataset.path === selectedPath) {
            setActiveFileButton(button);
          }
        });
      }

      setStatus('Directory tree refreshed.', 'success');
    } catch (error) {
      treeContainer.innerHTML = `<p class="error">${error.message}</p>`;
      setStatus(error.message, 'error');
    }
  }

  async function openFile(path, button) {
    setStatus('Loading file...');
    try {
      const response = await fetch(`/api/file?path=${encodeURIComponent(path)}`);
      const payload = await safeJson(response);
      if (!response.ok) {
        throw new Error(payload?.error || `Unable to open file (status ${response.status})`);
      }

      editor.value = payload.content;
      editor.disabled = false;
      editor.focus();
      fileTitle.textContent = payload.path;
      currentPath = payload.path;
      originalContent = payload.content;
      saveBtn.disabled = true;
      setActiveFileButton(button);
      expandToPath(payload.path);
      setStatus('File loaded.', 'success');
    } catch (error) {
      setStatus(error.message, 'error');
    }
  }

  async function saveFile() {
    if (!currentPath) {
      return;
    }

    setStatus('Saving changes...');
    saveBtn.disabled = true;

    try {
      const response = await fetch('/api/file', {
        method: 'PUT',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ path: currentPath, content: editor.value })
      });
      const payload = await safeJson(response);
      if (!response.ok) {
        throw new Error(payload?.error || `Unable to save file (status ${response.status})`);
      }

      originalContent = editor.value;
      setStatus('Changes saved.', 'success');
    } catch (error) {
      setStatus(error.message, 'error');
      saveBtn.disabled = false;
    }
  }

  editor.addEventListener('input', () => {
    if (!currentPath) {
      return;
    }
    saveBtn.disabled = editor.value === originalContent;
  });

  saveBtn.addEventListener('click', saveFile);
  refreshBtn.addEventListener('click', () => loadTree(currentPath));

  loadTree();
})();
