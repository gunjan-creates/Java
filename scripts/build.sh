#!/usr/bin/env bash
set -euo pipefail

# Build all Java sources into out/ using Java 21
ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
mkdir -p "$ROOT_DIR/out"

# Use Java 21 LTS
JAVA_HOME="${JAVA_HOME:-$HOME/.jdk/jdk-21.0.8}"
JAVAC="$JAVA_HOME/bin/javac"

# Find and compile all .java files
find "$ROOT_DIR/src" -name "*.java" > /tmp/_java_files.txt
if [ ! -s /tmp/_java_files.txt ]; then
  echo "No Java source files found under src/."
  exit 1
fi
"$JAVAC" -d "$ROOT_DIR/out" @/tmp/_java_files.txt
rm /tmp/_java_files.txt

echo "Build complete. Classes in $ROOT_DIR/out"
echo "Java version: $("$JAVA_HOME/bin/java" -version 2>&1 | head -1)"