#!/usr/bin/env bash
# Build and run Java programs with Java 21
# Usage: ./scripts/run.sh <package.ClassName>

JAVA_HOME="${JAVA_HOME:-$HOME/.jdk/jdk-21.0.8}"
JAVAC="$JAVA_HOME/bin/javac"
JAVA="$JAVA_HOME/bin/java"
ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
BIN_DIR="$ROOT_DIR/bin"

if [ $# -eq 0 ]; then
    echo "Usage: $0 <package.ClassName>"
    echo "Example: $0 Collections.ArrayListContains"
    exit 1
fi

CLASS_NAME="$1"
PACKAGE=$(echo "$CLASS_NAME" | cut -d. -f1)

# Compile only the specific package
mkdir -p "$BIN_DIR"
echo "Building $PACKAGE with Java 21..."
"$JAVAC" -d "$BIN_DIR" "$ROOT_DIR/src/$PACKAGE"/*.java

if [ $? -eq 0 ]; then
    echo "Build successful. Running $CLASS_NAME..."
    "$JAVA" -cp "$BIN_DIR" "$CLASS_NAME"
else
    echo "Build failed."
    exit 1
fi
