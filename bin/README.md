
# Java Examples & Playground

A compact collection of Java example programs and data-structure exercises organized for easy learning and experimentation. This workspace contains small, focused examples (arrays, data structures, exception handling, hashmap example, etc.) that you can compile and run locally using the JDK.

---

## Table of contents

- [Project Snapshot](#project-snapshot)
- [Repository layout](#repository-layout)
- [How to build (Windows PowerShell)](#how-to-build-windows-powershell)
- [Run an example](#run-an-example)
- [Contributing](#contributing)
- [Notes & Tips](#notes--tips)

---

## Project snapshot

- Language: Java (JDK required)
- Purpose: Educational examples (arrays, data structures, exception handling, hashmap example)
- Good for: learners practicing Java basics and core APIs

## Repository layout

Top-level folders:

- `src/` - Source code organized in subfolders (e.g., `Array/`, `DS/`, `Exception And Handeling/`, and example files like `Hashmapexample.java`).
- `lib/` - External libraries (if any). Place third-party jars here and add them to the classpath when compiling/running.
- `bin/` - Compiled .class files (output directory).

Example important files/folders you may see:

- `src/Array/` - array-related examples
- `src/DS/` - data structure examples (includes `Hashmapexample.java`)
- `src/Exception And Handeling/` - examples demonstrating try/catch and custom handling

## How to build (Windows PowerShell)

Open PowerShell at the project root (where `src/`, `bin/` and `lib/` live). The following commands will compile the Java files and place .class files in `bin`.

Compile all Java source files (simple, portable PowerShell loop):

```powershell
# create bin if missing
if (-not (Test-Path -Path .\bin)) { New-Item -ItemType Directory -Path .\bin | Out-Null }

# Compile every .java in src (outputs go to ./bin)
Get-ChildItem -Path .\src -Recurse -Filter *.java | ForEach-Object { javac -d .\bin $_.FullName }
```

If your examples require external jars in `lib/`, append `-cp` to javac, for example:

```powershell
javac -d .\bin -cp .\lib\some-lib.jar <path-to-source>.java
```

## Run an example

After compilation, run a class with the JDK. If the class is in the default package, run:

```powershell
java -cp .\bin Hashmapexample
```

If the class is inside a package (for example `package DS;` in the source), use the fully-qualified name:

```powershell
java -cp .\bin DS.Hashmapexample
```

Tip: Look inside the `.java` file to see its `package` statement (first non-comment line) and use the matching package-qualified class name when running.

## Contributing

- Create small, focused examples.
- Keep file and folder names clear (avoid spaces if possible; the project currently contains `Exception And Handeling` — consider renaming to `ExceptionAndHandling`).
- Add short README or inline comments for each new example so others can run them quickly.

## Notes & tips

- Recommended JDK: Java 8+ (ensure `javac` and `java` are on your PATH).
- Use your IDE (IntelliJ, Eclipse, or VS Code with Java extensions) to get a nicer edit/run experience.
- If you prefer to compile everything at once, you can also use an IDE project or a build tool (Maven/Gradle) for larger exercises.

---

Happy learning — explore the `src/` folder, compile a small example, and run it from PowerShell! If you want, I can also:

- add a small script to automate compile/run (PowerShell script), or
- create a simple `build.bat`/`build.ps1` and `run.ps1` for common examples.

If you'd like those, tell me which example(s) you run most and I'll add the scripts.

