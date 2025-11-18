This devcontainer ensures OpenJDK 21 is installed and configured when a Codespace or development container is created.

How to use

- Commit and push these files to the repository.
- In GitHub Codespaces: create a new Codespace or reopen the existing Codespace and choose "Rebuild Container" so the new container image is built with OpenJDK 21.
- In VS Code (local devcontainer): run the command palette -> "Dev Containers: Rebuild and Reopen in Container".

What this does

- Installs OpenJDK 21 via apt inside the dev container.
- Sets JAVA_HOME to `/usr/lib/jvm/java-21-openjdk-amd64` and adds it to PATH.
- Runs `java -version` and `javac -version` after container creation as a quick check.

Notes

- A Codespace will pick up this configuration automatically when the container is rebuilt or when a new Codespace is created from this branch.
- If you use SDKMAN or a different JDK distribution, we can adapt the Dockerfile to install that instead.
