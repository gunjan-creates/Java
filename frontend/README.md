# Frontend Workspace

This directory hosts a standalone Node-based frontend that lets you browse (and optionally edit) the files in the Java project without touching the existing build.

## Prerequisites

- Node.js 18 or newer
- npm (bundled with Node.js)

## Getting started

```bash
cd frontend
npm install
npm start
```

By default the server runs on <http://localhost:3000>. The React-free UI is delivered from `public/index.html`, and calls the REST endpoints exposed by `server.js`.

## Available endpoints

- `GET /api/tree` – returns the directory hierarchy rooted at the repository.
- `GET /api/file?path=<relativePath>` – fetches file contents.
- `PUT /api/file` – persists new contents to an existing file. Body expects `{ "path": "relative/path", "content": "..." }`.

The server blocks attempts to traverse outside the workspace root.

## Notes

- The Java codebase stays in `src/` unchanged; the frontend lives entirely in this folder.
- Update the `IGNORED_NAMES` list in `server.js` if you want to hide additional folders from the tree.
- For a richer client experience you can drop in a framework or in-browser editor (Monaco, CodeMirror) without impacting the Java sources.
