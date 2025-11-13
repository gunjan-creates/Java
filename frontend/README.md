# Frontend Workspace

This directory hosts a standalone frontend that lets you browse (and, when running locally, edit) the files in the Java project without touching the existing build.

## Modes

- **Local API mode** (default when running via `npm start`): an Express backend (`server.js`) serves the static UI and exposes REST endpoints so you can read and write files inside the repository.
- **GitHub Pages mode** (static hosting): the UI talks directly to the GitHub REST APIs to fetch the repository tree and raw file contents. This mode is read-only because GitHub Pages cannot host server-side code or safely store API tokens.

The UI auto-detects the mode based on the hostname.

## Prerequisites (local mode)

- Node.js 18 or newer
- npm (bundled with Node.js)

## Getting started locally

```bash
cd frontend
npm install
npm start
```

By default the server runs on <http://localhost:3000>. The UI lives in `public/`, while the backend logic is in `server.js`.

## GitHub Pages deployment

1. Commit the contents of `frontend/public/` to a branch that Pages serves from (for example `gh-pages`).
2. Configure the repository’s GitHub Pages settings to serve that branch and folder.
3. The deployed site will automatically switch to GitHub API mode and surface the repo tree read-only.

### Automated deployment via GitHub Actions

- A workflow (`.github/workflows/deploy-frontend.yml`) publishes the static assets in `frontend/public/` to GitHub Pages whenever `main` is updated.
- After merging the workflow, go to **Repository Settings → Pages**, set the **Source** to **GitHub Actions**, and Pages will pick up the workflow runs.
- You can also trigger a manual deployment from the **Actions** tab using the **Deploy Frontend to GitHub Pages** workflow dispatch.

> ℹ️ GitHub’s unauthenticated REST API rate limit is 60 requests per hour per IP. Heavy usage may require embedding a Personal Access Token during the build process or hosting behind your own backend.

## REST endpoints (local mode)

- `GET /api/tree` – returns the directory hierarchy rooted at the repository.
- `GET /api/file?path=<relativePath>` – fetches file contents.
- `PUT /api/file` – persists new contents to an existing file. Body expects `{ "path": "relative/path", "content": "..." }`.

The server blocks attempts to traverse outside the workspace root and skips common tooling folders listed in `IGNORED_NAMES`.

## Notes

- The Java codebase stays in `src/` unchanged; the frontend lives entirely in this folder.
- Update the `IGNORED_NAMES` list in `server.js` and `public/app.js` if you want to hide additional folders from the tree.
- For richer client-side editing on static hosting, wire the UI to an authenticated API gateway or serverless function that proxies GitHub writes.
