````markdown
# Java Examples & Playground

This repository contains a comprehensive collection of **600+ Java example programs** designed to help beginners master Java programming fundamentals.

## Project Overview

- **Java Version**: JDK 21 (Latest LTS)
- **Development Environment**: GitHub Codespaces with VS Code
- **Build System**: Make (simple compilation)
- **Purpose**: Complete beginner-friendly educational resource
- **Total Programs**: 600+ working examples

## Package Overview - 100 Programs Each

Each package contains exactly 100 beginner-friendly programs covering essential concepts:

### 1. **Collections** (`src/Collections/`) - 100 Programs
   - ArrayList operations (add, remove, get, set, contains, etc.)
   - LinkedList and Deque operations
   - HashSet and TreeSet usage
   - HashMap and TreeMap operations
   - PriorityQueue examples
   - Collections utility methods
   - Iterator patterns
   - [See detailed README](src/Collections/README.md)

### 2. **Data Structures** (`src/DS/`) - 100 Programs
   - Array operations and examples
   - HashMap and HashSet usage
   - TreeMap and TreeSet examples
   - Stack and Queue implementations
   - EnumMap examples
   - Basic algorithms
   - [See detailed README](src/DS/README.md)

### 3. **Exception Handling** (`src/ExceptionHandelling/`) - 100 Programs
   - Try-catch-finally blocks
   - Built-in exceptions
   - Custom exceptions
   - Exception chaining
   - Try-with-resources
   - Best practices
   - [See detailed README](src/ExceptionHandelling/README.md)
   - Legacy examples remain in `src/ExceptionHandling/` (note the spelling difference) including `ExceptionHandlingDemo.java`

### 4. **Multithreading** (`src/Multithreading/`) - 100 Programs
   - Thread creation (Thread class and Runnable)
   - Synchronization techniques
   - ExecutorService and thread pools
   - Thread communication
   - Concurrent collections
   - Best practices for thread safety
   - [See detailed README](src/Multithreading/README.md)

### 5. **Streams API** (`src/Streams/`) - 100 Programs
   - Stream creation and basics
   - Intermediate operations (filter, map, flatMap)
   - Terminal operations (forEach, collect, reduce)
   - Collectors usage
   - Parallel streams
   - Optional handling
   - [See detailed README](src/Streams/README.md)

### 6. **Strings & Exception Handling** (`src/StringExceptionHandling/`) - 100 Programs
   - String manipulation methods
   - StringBuilder and StringBuffer
   - Regular expressions
   - String formatting
   - Combined with exception handling patterns
   - [See detailed README](src/StringExceptionHandling/README.md)

## How to Use This Repository

### Building All Programs

```bash
# Clean previous builds
make clean

# Compile all 600+ programs
make build
```

### Running Individual Programs

```bash
# Run a Collections example
make run CLASS=Collections.ArrayListBasicAdd

# Run a Data Structures example
make run CLASS=DS.Hashmapexample

# Run an Exception Handling example
make run CLASS=ExceptionHandelling.BuiltinException

# Run a Multithreading example
make run CLASS=Multithreading.MultithreadingDemo

# Run a Streams example
make run CLASS=Streams.StreamOperationsExample

# Run a String example
make run CLASS=StringExceptionHandling.StringManupulationExample
```

## Learning Path for Beginners

1. **Start with Collections** - Learn fundamental data structures
2. **Master Exception Handling** - Understand error handling
3. **Explore Strings** - Work with text manipulation
4. **Study Data Structures** - Deepen your understanding
5. **Learn Streams API** - Modern Java programming
6. **Practice Multithreading** - Concurrent programming

## Project Statistics

- **Total Programs**: 600+
- **Lines of Code**: 15,000+
- **Topics Covered**: 50+
- **All Programs**: ✅ Compile successfully
- **All Programs**: ✅ Runnable with examples

## GitHub Pages - Interactive Project Explorer

This repository includes an interactive web-based project explorer deployed to GitHub Pages!

🌐 **Visit the live site**: [https://gunjan-creates.github.io/Java/](https://gunjan-creates.github.io/Java/)

### Features
- **Browse Repository**: Navigate through all 600+ Java programs organized by package
- **View Source Code**: Read any Java file directly in your browser
- **Read-Only Mode**: Safe browsing without modifying the repository
- **Responsive Design**: Works on desktop and mobile devices

### How It Works
The GitHub Pages site is automatically deployed when changes are pushed to the `main` branch. The deployment workflow:
1. Copies the frontend files from `frontend/public/`
2. Deploys them to GitHub Pages
3. Makes the interactive explorer available at the GitHub Pages URL

### Local Development
To run the project explorer locally:
```bash
cd frontend
npm install
npm start
```
Then visit `http://localhost:3000` in your browser. In local mode, you can also edit files through the interface.

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




























ok the readme is completed now !
