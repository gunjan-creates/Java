# Simple Makefile to build and run examples with Java 21
JAVA_HOME ?= $(HOME)/.jdk/jdk-21.0.8
JAVAC := $(JAVA_HOME)/bin/javac
JAVA := $(JAVA_HOME)/bin/java
JAVA_SRC := $(shell find src -name "*.java")
OUT_DIR := bin

.PHONY: all build run clean version
all: build

version:
	@$(JAVA) -version

build:
	@mkdir -p $(OUT_DIR)
	@echo "Compiling Java sources with Java 21..."
	@$(JAVAC) -d $(OUT_DIR) $(JAVA_SRC)
	@echo "Build finished."

run: build
	@if [ -z "$(CLASS)" ]; then \
		echo "Please specify CLASS (e.g. make run CLASS=Collections.ArrayListContains)"; exit 1; \
	else \
		$(JAVA) -cp $(OUT_DIR) $(CLASS); \
	fi

clean:
	rm -rf $(OUT_DIR)
	echo "Cleaned."