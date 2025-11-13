'use strict';

const express = require('express');
const path = require('path');
const fs = require('fs/promises');
const cors = require('cors');

const app = express();
const PORT = process.env.PORT || 3000;
const ROOT_DIR = path.resolve(__dirname, '..');

const IGNORED_NAMES = new Set([
  'node_modules',
  '.git',
  '.vscode',
  '.idea',
  'out',
  'build',
  '.DS_Store'
]);

app.use(cors());
app.use(express.json({ limit: '2mb' }));
app.use(express.static(path.join(__dirname, 'public')));

function ensureWithinRoot(targetPath) {
  const normalizedRoot = ROOT_DIR + path.sep;
  if (targetPath !== ROOT_DIR && !targetPath.startsWith(normalizedRoot)) {
    const err = new Error('Path outside of project root');
    err.status = 400;
    throw err;
  }
}

function toPosix(relativePath) {
  return relativePath.split(path.sep).join('/');
}

async function buildTree(currentDir) {
  const entries = await fs.readdir(currentDir, { withFileTypes: true });
  const nodes = [];

  for (const entry of entries) {
    if (IGNORED_NAMES.has(entry.name) || entry.name.startsWith('.git')) {
      continue;
    }

    const absolute = path.join(currentDir, entry.name);
    const relative = toPosix(path.relative(ROOT_DIR, absolute));

    if (entry.isDirectory()) {
      nodes.push({
        type: 'directory',
        name: entry.name,
        path: relative,
        children: await buildTree(absolute)
      });
      continue;
    }

    if (entry.isFile()) {
      nodes.push({
        type: 'file',
        name: entry.name,
        path: relative
      });
    }
  }

  nodes.sort((a, b) => {
    if (a.type !== b.type) {
      return a.type === 'directory' ? -1 : 1;
    }
    return a.name.localeCompare(b.name);
  });

  return nodes;
}

app.get('/api/tree', async (req, res, next) => {
  try {
    const tree = {
      type: 'directory',
      name: path.basename(ROOT_DIR),
      path: '',
      children: await buildTree(ROOT_DIR)
    };
    res.json(tree);
  } catch (error) {
    next(error);
  }
});

app.get('/api/file', async (req, res, next) => {
  try {
    const requestedPath = req.query.path;

    if (!requestedPath) {
      return res.status(400).json({ error: 'Missing path query parameter' });
    }

    const normalized = path.normalize(requestedPath);
    const absolute = path.resolve(ROOT_DIR, normalized);
    ensureWithinRoot(absolute);

    const stats = await fs.stat(absolute);
    if (!stats.isFile()) {
      return res.status(400).json({ error: 'Requested path is not a file' });
    }

    const content = await fs.readFile(absolute, 'utf8');
    res.json({ path: toPosix(path.relative(ROOT_DIR, absolute)), content });
  } catch (error) {
    if (error.code === 'ENOENT') {
      return res.status(404).json({ error: 'File not found' });
    }
    next(error);
  }
});

app.put('/api/file', async (req, res, next) => {
  try {
    const { path: filePath, content } = req.body || {};

    if (!filePath || typeof content !== 'string') {
      return res.status(400).json({ error: 'Request body must include path and content' });
    }

    const normalized = path.normalize(filePath);
    const absolute = path.resolve(ROOT_DIR, normalized);
    ensureWithinRoot(absolute);

    const stats = await fs.stat(absolute);
    if (!stats.isFile()) {
      return res.status(400).json({ error: 'Target path is not a file' });
    }

    await fs.writeFile(absolute, content, 'utf8');
    res.json({ ok: true });
  } catch (error) {
    if (error.code === 'ENOENT') {
      return res.status(404).json({ error: 'File not found' });
    }
    next(error);
  }
});

app.use((err, req, res, next) => {
  const status = err.status || 500;
  res.status(status).json({ error: err.message || 'Unexpected server error' });
});

app.get('*', (req, res) => {
  res.sendFile(path.join(__dirname, 'public', 'index.html'));
});

app.listen(PORT, () => {
  console.log(`Frontend helper running on http://localhost:${PORT}`);
});
