# Java 21 LTS Quick Reference

## Quick Start

```bash
# Build everything
make build

# Run a specific class
make run CLASS=Collections.ArrayListContains

# Or use the convenience script
./scripts/run-java21.sh Collections.ArrayListContains

# Check Java version
make version
```

## Installed Java Versions

- **Java 21.0.8 LTS** (Primary - at `~/.jdk/jdk-21.0.8`)
- Java 17.0.17 (Legacy - at `/usr/lib/jvm/java-17-openjdk-amd64`)

## Updated Files

1. **Makefile** - Now targets Java 21 explicitly
2. **scripts/build.sh** - Updated to use Java 21
3. **scripts/run-java21.sh** - New helper script for running individual packages
4. **.java-version** - Documents Java 21.0.8
5. **JAVA_UPGRADE.md** - Detailed upgrade information

## Key Features of Java 21 LTS

- Long-term support until September 2031
- Virtual Threads (Project Loom)
- Record Patterns (Pattern Matching)
- Sequenced Collections API
- Improved performance and security

## Switching Java Versions (if needed)

```bash
# Use Java 17 temporarily
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
make build

# Switch back to Java 21
export JAVA_HOME=$HOME/.jdk/jdk-21.0.8
make build
```

## Troubleshooting

If `JAVA_HOME` is not set, the Makefile defaults to `~/.jdk/jdk-21.0.8`.

If you need to install a different Java 21 patch version:
```bash
# This will be handled by the install_jdk tool
```

For more details, see `JAVA_UPGRADE.md`.
