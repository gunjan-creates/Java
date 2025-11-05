# Simple Makefile to build and run examples
JAVA_SRC := $(shell find src -name "*.java")
OUT_DIR := out

.PHONY: all build run clean
all: build

build:
	@mkdir -p $(OUT_DIR)
	@echo "Compiling Java sources..."
	@javac -d $(OUT_DIR) $(JAVA_SRC)
	@echo "Build finished."

run: build
	@if [ -z "$(CLASS)" ]; then \
		echo "Please specify CLASS (e.g. make run CLASS=DS.Hashmapexample)"; exit 1; \
	else \
		java -cp $(OUT_DIR) $(CLASS); \
	fi

clean:
	rm -rf $(OUT_DIR)
	echo "Cleaned."