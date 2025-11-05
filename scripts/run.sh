#!/usr/bin/env bash
set -euo pipefail

# Usage: ./scripts/run.sh Fully.Qualified.ClassName
ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
CLASS_NAME="${1:-DS.Hashmapexample}"

# Build first
bash "$ROOT_DIR/scripts/build.sh"

# Run
java -cp "$ROOT_DIR/out" "$CLASS_NAME"