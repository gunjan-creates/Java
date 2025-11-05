# Dev container that ensures OpenJDK 21 is installed and set as default
FROM mcr.microsoft.com/devcontainers/base:ubuntu

# avoid interactive prompts
ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update \
    && apt-get install -y --no-install-recommends \
       ca-certificates \
       wget \
       gnupg \
       software-properties-common \
    && rm -rf /var/lib/apt/lists/*

# Install OpenJDK 21 from the Ubuntu repos
RUN apt-get update \
    && apt-get install -y --no-install-recommends openjdk-21-jdk \
    && rm -rf /var/lib/apt/lists/*

ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
ENV PATH="${JAVA_HOME}/bin:${PATH}"

# Verify installation during image build
RUN java -version && javac -version || true

# Use vscode user from the base image
USER vscode
