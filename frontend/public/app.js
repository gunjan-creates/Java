(() => {
  const treeContainer = document.getElementById('tree');
  const editor = document.getElementById('editor');
  const fileTitle = document.getElementById('file-title');
  const saveBtn = document.getElementById('save-btn');
  const statusEl = document.getElementById('status');
  const refreshBtn = document.getElementById('refresh-btn');
  const directoryTemplate = document.getElementById('template-directory');
  const fileTemplate = document.getElementById('template-file');
  const modeBanner = document.getElementById('mode-banner');

  const CONFIG = {
    owner: 'gunjan-creates',
    repo: 'Java',
    branch: 'main',
    useLocalApi: ['localhost', '127.0.0.1'].includes(window.location.hostname)
  };

  const IGNORED_NAMES = new Set([
    'node_modules',
    '.git',
    '.vscode',
    '.idea',
    'out',
    'build',
    '.DS_Store'
  ]);

  const IS_LOCAL = CONFIG.useLocalApi;
  const RAW_BASE = `https://raw.githubusercontent.com/${CONFIG.owner}/${CONFIG.repo}/${CONFIG.branch}`;
  const TREE_ENDPOINT = `https://api.github.com/repos/${CONFIG.owner}/${CONFIG.repo}/git/trees/${CONFIG.branch}?recursive=1`;

  if (modeBanner) {
    if (IS_LOCAL) {
      modeBanner.hidden = false;
      modeBanner.textContent = 'Local API mode: editing enabled via Express backend.';
    } else {
      modeBanner.hidden = false;
      modeBanner.textContent = `GitHub Pages mode: browsing ${CONFIG.owner}/${CONFIG.repo}@${CONFIG.branch} (read-only).`;
      saveBtn.hidden = true;
      editor.readOnly = true;
    }
  }

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

  function shouldIgnorePath(relativePath) {
    return relativePath
      .split('/')
      .some((segment) => IGNORED_NAMES.has(segment) || segment.startsWith('.git'));
  }

  function sortTree(node) {
    if (!node || !Array.isArray(node.children)) {
      return;
    }

    node.children.sort((a, b) => {
      if (a.type !== b.type) {
        return a.type === 'directory' ? -1 : 1;
      }
      return a.name.localeCompare(b.name);
    });

    node.children.forEach(sortTree);
  }

  async function fetchTreeData() {
    if (IS_LOCAL) {
      const response = await fetch('/api/tree');
      const payload = await safeJson(response);
      if (!response.ok) {
        throw new Error(payload?.error || `Unable to retrieve tree (status ${response.status})`);
      }
      return payload;
    }

    const response = await fetch(TREE_ENDPOINT, {
      headers: { 'Accept': 'application/vnd.github+json' }
    });
    if (!response.ok) {
      const payload = await response.json().catch(() => ({}));
      const message = payload.message || `GitHub tree request failed (status ${response.status})`;
      throw new Error(message);
    }

    const data = await response.json();
    const rootNode = {
      type: 'directory',
      name: CONFIG.repo,
      path: '',
      children: []
    };

    const directories = new Map([['', rootNode]]);

    function ensureDirectory(dirPath) {
      if (directories.has(dirPath)) {
        return directories.get(dirPath);
      }

      const segments = dirPath ? dirPath.split('/') : [];
      let traversed = '';
      let parentNode = directories.get('');

      for (const segment of segments) {
        traversed = traversed ? `${traversed}/${segment}` : segment;
        let directoryNode = directories.get(traversed);
        if (!directoryNode) {
          directoryNode = {
            type: 'directory',
            name: segment,
            path: traversed,
            children: []
          };
          directories.set(traversed, directoryNode);
          parentNode.children.push(directoryNode);
        }
        parentNode = directoryNode;
      }

      return directories.get(dirPath || '') || rootNode;
    }

    for (const entry of data.tree || []) {
      if (!entry.path || shouldIgnorePath(entry.path)) {
        continue;
      }

      if (entry.type === 'tree') {
        ensureDirectory(entry.path);
        continue;
      }

      if (entry.type === 'blob') {
        const lastSlash = entry.path.lastIndexOf('/');
        const dirPath = lastSlash >= 0 ? entry.path.slice(0, lastSlash) : '';
        const fileName = lastSlash >= 0 ? entry.path.slice(lastSlash + 1) : entry.path;
        const dirNode = ensureDirectory(dirPath);
        dirNode.children.push({
          type: 'file',
          name: fileName,
          path: entry.path
        });
      }
    }

    sortTree(rootNode);
    return rootNode;
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
      const payload = await fetchTreeData();

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

  async function fetchFileContent(path) {
    if (IS_LOCAL) {
      const response = await fetch(`/api/file?path=${encodeURIComponent(path)}`);
      const payload = await safeJson(response);
      if (!response.ok) {
        throw new Error(payload?.error || `Unable to open file (status ${response.status})`);
      }
      return payload;
    }

    const response = await fetch(`${RAW_BASE}/${path}`);
    if (!response.ok) {
      throw new Error(`Raw content request failed (status ${response.status})`);
    }
    const content = await response.text();
    return { path, content };
  }

  async function openFile(path, button) {
    setStatus('Loading file...');
    try {
      const payload = await fetchFileContent(path);

      editor.value = payload.content;
      editor.disabled = false;
      editor.readOnly = !IS_LOCAL;
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
    if (!IS_LOCAL || !currentPath) {
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
    if (!IS_LOCAL || !currentPath) {
      return;
    }
    saveBtn.disabled = editor.value === originalContent;
  });

  saveBtn.addEventListener('click', saveFile);
  refreshBtn.addEventListener('click', () => loadTree(currentPath));

  loadTree();
})();
