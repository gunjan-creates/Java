````markdown
# Java Examples & Playground

This repository contains a comprehensive collection of Java example programs demonstrating various Java features, APIs, and best practices.

## Project Overview

- **Java Version**: JDK 21 (Latest LTS)
- **Development Environment**: GitHub Codespaces with VS Code
- **Build System**: Direct compilation (Maven/Gradle integration planned)
- **Purpose**: Educational examples and reference implementations

## Implemented Examples

1. **Data Structures** (`src/DS/`)
   - HashMap implementation and usage patterns
   - Custom data structure implementations

2. **Exception Handling**
   - Folders in use: `src/ExceptionHandling/` and `src/ExceptionHandelling/`
   - Recently added (ExceptionHandelling): `EH01` to `EH10`
     - Try/catch basics, multiple catch, finally, `throw`, `throws`,
       custom checked/unchecked exceptions, try-with-resources, exception chaining, validation
   - Previously added (ExceptionHandling): `ExceptionHandlingDemo.java`

3. **Multithreading** (`src/Multithreading/`)
   - Basic thread creation (Thread & Runnable)
   - ExecutorService and thread pools
   - Synchronized blocks and thread safety
   - CompletableFuture for async operations
   - Atomic operations
   - Thread-safe data structures

## Upcoming Examples

- Design Patterns (Factory, Builder, Observer)
- File I/O operations with NIO.2
- Advanced Collections and Generics
- Functional Programming with Lambda
- Stream API operations
- Optional API usage patterns

## Project History

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
