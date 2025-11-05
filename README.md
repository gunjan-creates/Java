Project: Java examples & playground

This repository contains small Java example programs and data-structure exercises.

Purpose of this file

This README documents a recent maintenance session: upgrading the development environment to Java 21 and the problems we encountered while making that change permanent in GitHub Codespaces. It lists the problems, why they happened, and the concrete solutions applied so the fixes are reproducible.

Problems & solutions

1) JDK 21 not available by default in Codespaces
   - Cause: The running Codespace had an older JDK (11). Installing a JDK manually inside a running Codespace is ephemeral.
   - Fix: Add a `.devcontainer` configuration so OpenJDK 21 is installed during the container build. Files added:
     - `.devcontainer/Dockerfile` — installs `openjdk-21-jdk` and sets `JAVA_HOME`.
     - `.devcontainer/devcontainer.json` — instructs Codespaces to build using the Dockerfile.
   - Apply: Commit & push the `.devcontainer` folder and rebuild the Codespace (Codespaces → Rebuild Container).

2) Ephemeral install disappears after Codespace stops
   - Cause: Codespaces containers are ephemeral unless the image is rebuilt from repository devcontainer files.
   - Fix: Use `.devcontainer` so the JDK is baked into the image.

3) Empty folder not visible on GitHub
   - Cause: Git does not track empty directories.
   - Fix: Add `src/Exception Handelling/.gitkeep` so the folder is tracked. Replace `.gitkeep` later with real example files.

4) `git push` failing due to Git LFS pre-push hook
   - Cause: The repo had Git LFS configured and the pre-push hook prevents pushing without `git-lfs` installed.
   - Fix: Install Git LFS in the Codespace (`sudo apt-get install git-lfs`) and run `git lfs install`, then push.

5) Automated Copilot upgrade planner blocked
   - Cause: The planner tool requires a paid Copilot plan (Pro/Business/Enterprise).
   - Fix: Either enable the appropriate Copilot plan or use local tools (OpenRewrite) to run code mods.

Commands used (examples)

```bash
# install OpenJDK 21 (in container/Dockerfile or manually)
sudo apt-get update -y
sudo apt-get install -y openjdk-21-jdk

# install git-lfs and initialize it
sudo apt-get install -y git-lfs
git lfs install --system

# stage & push changes (devcontainer + .gitkeep)
git add .devcontainer src/Exception\ Handelling/.gitkeep
git commit -m "chore(devcontainer): install OpenJDK 21; add Exception Handelling placeholder"
git push origin HEAD

# compile & run using JDK 21 inside the Codespace
mkdir -p out
javac --release 21 -d out $(find src -name "*.java")
java -cp out DS.Hashmapexample
```

Next recommended steps

- Rebuild the Codespace so the `.devcontainer` image is used.
- Replace `.gitkeep` with actual exception-handling examples (rename folder to avoid spaces if desired).
- Add a small Maven `pom.xml` or Gradle `build.gradle` configured for Java 21 and a GitHub Actions workflow that builds/tests with Java 21.

If you want, I can add the build manifest and CI workflow next.
