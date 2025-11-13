
# Java Examples & Playground

A comprehensive collection of Java example programs organized for effective learning and reference. This workspace demonstrates various Java features, APIs, and programming patterns using JDK 21.

---

## Table of contents

- [Examples Overview](#examples-overview)
- [Repository Structure](#repository-structure)
- [Building and Running](#building-and-running)
- [Contributing](#contributing)
- [Notes & Tips](#notes--tips)

## Examples Overview

### Implemented Examples

1. **Data Structures** (`DS/`)
   - HashMap implementation with practical examples
   - Demonstration of key data structure concepts

2. **Exception Handling**
   - Folders in use: `ExceptionHandling/` and `ExceptionHandelling/`
   - New programs in `ExceptionHandelling/`: EH01–EH10 covering:
     - Try/catch basics, multiple catch, finally
     - Throw and throws
     - Custom checked/unchecked exceptions
     - Try-with-resources and exception chaining
     - Input validation patterns

3. **Multithreading** (`Multithreading/`)
   - Thread creation and management
   - ExecutorService usage
   - Synchronized operations
   - CompletableFuture demonstrations
   - Thread-safe programming

---

### Planned Examples

- Stream API operations
- Collections framework deep dive
- Design patterns implementations
- File I/O with NIO.2
- Functional programming patterns
- Optional API usage
- Advanced generics

## Repository Structure

Top-level folders:

- `DS/` - Data structure implementations and examples
- `ExceptionHandling/` - Exception handling patterns and best practices
- `Multithreading/` - Concurrency and parallel processing examples

Output directory:
- `out/` - Compiled .class files (created during build)

## Building and Running

The project uses JDK 21 features and is configured to work seamlessly in GitHub Codespaces. Here's how to build and run the examples:

### Using GitHub Codespaces (Recommended)

The development container is pre-configured with JDK 21 and all necessary tools.

```bash
# Compile all Java files
mkdir -p out
javac -d out src/**/*.java

# Run specific examples
java -cp out ExceptionHandling.ExceptionHandlingDemo
java -cp out ExceptionHandelling.EH01_TryCatchBasics
java -cp out Multithreading.MultithreadingDemo
java -cp out DS.Hashmapexample
```

### Running Specific Examples

Each example is organized in its own package. To run a specific example:

1. **Exception Handling Demo**:
   ```bash
   java -cp out ExceptionHandling.ExceptionHandlingDemo
   ```

2. **Multithreading Demo**:
   ```bash
   java -cp out Multithreading.MultithreadingDemo
   ```

3. **Data Structure Examples**:
   ```bash
   java -cp out DS.Hashmapexample
   ```

## Contributing

1. **Code Organization**
   - Create focused, single-purpose examples
   - Follow standard Java package naming conventions
   - Include clear documentation and comments

2. **Documentation**
   - Add JavaDoc comments to public classes and methods
   - Include example usage in class-level documentation
   - Document any specific requirements or dependencies

3. **Testing**
   - Test all examples thoroughly before submitting
   - Include example input/output in comments
   - Ensure compatibility with JDK 21

## Notes & Tips

- **Development Environment**:
  - Using GitHub Codespaces is recommended (pre-configured)
  - VS Code with Java extensions for the best experience
  - JDK 21 features are available and encouraged

- **Best Practices**:
  - Follow Java coding conventions
  - Use modern Java features where appropriate
  - Include error handling in examples
  - Document thread safety considerations

- **Future Plans**:
  - Maven/Gradle build system integration
  - Automated tests for all examples
  - CI/CD pipeline with GitHub Actions
  - Comprehensive documentation site

---

Happy coding! Explore the examples, learn from the implementations, and feel free to contribute your own examples following the project's guidelines.

