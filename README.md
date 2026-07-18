# 🐳 Docker Practice Projects

A collection of Docker-based applications demonstrating containerization of Java, Node.js, and Python applications using **Dockerfiles**, **Docker Compose**, and **Docker best practices**.

This repository showcases Docker fundamentals including image creation, container management, dependency installation, build optimization using `.dockerignore`, port mapping, and multi-container orchestration.

---

# 📌 Project Overview

This repository contains six independent applications:

- Java Console Application
- Node.js Console Application
- Python Console Application
- Java Spring Boot Web Application
- Node.js Express Web Application
- Python Flask Web Application

Each application contains its own:

- Dockerfile
- .dockerignore
- Source Code

Every application can be built independently or orchestrated together using Docker Compose.

---

# 📂 Repository Structure

```text
project-images-demo/
│
├── java/
│   ├── Dockerfile
│   ├── .dockerignore
│   └── Main.java
│
├── node/
│   ├── Dockerfile
│   ├── .dockerignore
│   └── app.js
│
├── python/
│   ├── Dockerfile
│   ├── .dockerignore
│   └── app.py
│
├── web-images/
│   ├── java-web-sb/
│   │   ├── Dockerfile
│   │   ├── .dockerignore
│   │   └── ...
│   │
│   ├── node-web/
│   │   ├── Dockerfile
│   │   ├── .dockerignore
│   │   └── ...
│   │
│   └── python-web/
│       ├── Dockerfile
│       ├── .dockerignore
│       └── ...
│
├── docker-compose.yml
└── README.md
```

---

# 🚀 Technologies Used

- Docker
- Docker Compose
- Java 21
- Spring Boot
- Maven
- Node.js
- Express.js
- npm
- Python 3
- Flask
- pip

---

# 📖 Docker Concepts Covered

- Docker Images
- Docker Containers
- Dockerfile
- Base Images
- Build Context
- Image Layers
- WORKDIR
- COPY
- RUN
- CMD
- ENTRYPOINT
- EXPOSE
- Port Mapping
- Environment Variables
- Interactive Containers
- Dependency Installation
- Build Cache
- `.dockerignore`
- Docker Compose
- Multi-Service Applications

---

# 📦 Projects

## Java Console Application

### Features

- Java compilation inside Docker
- Interactive terminal application
- Eclipse Temurin JDK
- No local JDK required

---

## Node.js Console Application

### Features

- Interactive CLI
- Built-in readline module
- Lightweight Docker image

---

## Python Console Application

### Features

- Interactive terminal input
- Lightweight Python image

---

## Java Spring Boot Web Application

### Features

- Maven Build
- Spring Boot
- Embedded Tomcat
- REST API
- Port 8080

---

## Node.js Express Web Application

### Features

- Express Server
- npm dependency installation
- Port 3000

---

## Python Flask Web Application

### Features

- Flask Server
- pip dependency installation
- Port 5000

---

# ⚙️ Running Individual Applications

## Build Image

```bash
docker build -t image-name .
```

## Run CLI Application

```bash
docker run -it image-name
```

## Run Web Application

```bash
docker run -p <host-port>:<container-port> image-name
```

Example

```bash
docker run -p 8080:8080 java-web
```

---

# 🐳 Docker Compose

## Build Images

```bash
docker compose build
```

## Build & Start Services

```bash
docker compose up --build
```

## Start Existing Services

```bash
docker compose up
```

## Detached Mode

```bash
docker compose up -d
```

## Stop Services

```bash
docker compose down
```

## View Running Containers

```bash
docker compose ps
```

## View Logs

```bash
docker compose logs
```

---

# 🌐 Application URLs

| Application | URL |
|------------|--------------------------|
| Java Spring Boot | http://localhost:8080 |
| Node.js Express | http://localhost:3000 |
| Python Flask | http://localhost:5000 |

---

# ⚡ Docker Best Practices Implemented

- Separate Dockerfile for each application
- Separate `.dockerignore` for each build context
- Dependency installation inside Docker
- Lightweight base images
- Build context optimization
- Faster Docker builds
- Smaller Docker images
- Clean project structure
- Docker Compose for multi-container execution

---

# 📁 Why `.dockerignore`?

Each project contains its own `.dockerignore` file.

Benefits:

- Prevents unnecessary files from being sent to the Docker daemon.
- Reduces Docker build context size.
- Speeds up image builds.
- Produces cleaner Docker images.
- Avoids copying IDE files, Git metadata, logs, caches, and local dependencies.

Examples of ignored files:

- `.git/`
- `.gitignore`
- `README.md`
- `node_modules/`
- `target/`
- `__pycache__/`
- `.venv/`
- `.idea/`
- `.vscode/`
- `*.log`

---

# 🎯 Key Learning Outcomes

- Building Docker images
- Creating Dockerfiles
- Understanding image layers
- Optimizing Docker builds
- Using `.dockerignore`
- Installing application dependencies
- Running CLI applications
- Running web applications
- Port mapping
- Docker Compose orchestration
- Multi-container workflows
- Docker best practices

---

# 🚀 Future Enhancements

- Docker Volumes
- Docker Networks
- Multi-stage Docker Builds
- Docker Hub Integration
- Jenkins CI/CD Pipeline
- Kubernetes Deployment
- Nginx Reverse Proxy
- AWS ECR
- AWS EKS

---

# 👨‍💻 Author

**Lingu Md**

MCA Graduate | Aspiring DevOps Engineer

Interested in DevOps, Cloud Computing, Linux, Docker, Kubernetes, AWS, CI/CD, and Full-Stack Development.
