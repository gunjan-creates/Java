#!/usr/bin/env bash
set -euo pipefail

# Build all Java sources into out/
ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
mkdir -p "$ROOT_DIR/out"

# Find and compile all .java files
find "$ROOT_DIR/src" -name "*.java" > /tmp/_java_files.txt
if [ ! -s /tmp/_java_files.txt ]; then
  echo "No Java source files found under src/."
  exit 1
fi
javac -d "$ROOT_DIR/out" @/tmp/_java_files.txt
rm /tmp/_java_files.txt

echo "Build complete. Classes in $ROOT_DIR/out"