# 🐳 Docker Practice Projects

A collection of Docker-based applications demonstrating containerization of Java, Node.js, and Python applications using Dockerfiles and Docker Compose.

This repository showcases Docker fundamentals including image creation, container management, dependency installation, port mapping, and multi-container orchestration.

## Project Overview

This repository contains six independent applications:

- Java Console Application
- Node.js Console Application
- Python Console Application
- Java Spring Boot Web Application
- Node.js Express Web Application
- Python Flask Web Application

Each application has its own Dockerfile and can be built independently or orchestrated together using Docker Compose.

## Repository Structure

```text
project-images-demo/
│
├── java/
│   ├── Dockerfile
│   └── Main.java
│
├── node/
│   ├── Dockerfile
│   └── app.js
│
├── python/
│   ├── Dockerfile
│   └── app.py
│
├── web-images/
│   ├── java-web-sb/
│   ├── node-web/
│   └── python-web/
│
├── docker-compose.yml
└── README.md
```

## Technologies Used

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

## Docker Concepts Covered

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
- EXPOSE
- Port Mapping
- Interactive Containers
- Dependency Installation
- Docker Compose
- Multi-Service Applications

## Projects

### Java Console Application

**Description**

Simple interactive Java application built inside a Docker image using Eclipse Temurin JDK.

**Features**

- Java compilation inside Docker
- Interactive terminal application
- No local JDK required

### Node.js Console Application

**Description**

Interactive Node.js application using the built-in `readline` module.

**Features**

- Node.js Docker image
- Interactive CLI
- Lightweight Dockerfile

### Python Console Application

**Description**

Simple Python CLI application demonstrating Docker container execution.

**Features**

- Python Docker image
- Interactive terminal input
- Lightweight image

### Java Spring Boot Application

**Description**

REST API built using Spring Boot and Maven.

**Features**

- Maven Build
- Embedded Tomcat
- Dockerized Spring Boot
- Port 8080

### Node.js Express Application

**Description**

Simple Express web server containerized using Docker.

**Features**

- npm dependency installation
- Express Server
- Port 3000

### Python Flask Application

**Description**

Minimal Flask web application running inside Docker.

**Features**

- pip dependency installation
- Flask Server
- Port 5000

## Running Individual Applications

### Build

```bash
docker build -t image-name .
```

### Run CLI Applications

```bash
docker run -it image-name
```

### Run Web Applications

```bash
docker run -p <host-port>:<container-port> image-name
```

Example:

```bash
docker run -p 8080:8080 java-web
```

## Docker Compose

Build all images:

```bash
docker compose build
```

Build and start all services:

```bash
docker compose up --build
```

Start existing services:

```bash
docker compose up
```

Run in detached mode:

```bash
docker compose up -d
```

Stop all services:

```bash
docker compose down
```

View running containers:

```bash
docker compose ps
```

View logs:

```bash
docker compose logs
```

## Application URLs

| Application | URL |
|-------------|-----|
| Java Spring Boot | http://localhost:8080 |
| Node.js Express | http://localhost:3000 |
| Python Flask | http://localhost:5000 |

## Key Learning Outcomes

- Building Docker images
- Creating Dockerfiles
- Running Docker containers
- Installing application dependencies
- Port mapping
- Running CLI applications
- Running web applications
- Docker Compose orchestration
- Multi-container workflows
- Understanding Docker image layers

## Future Enhancements

- Docker Volumes
- Docker Networks
- Multi-stage Docker Builds
- Docker Hub Integration
- Jenkins CI/CD Pipeline
- Kubernetes Deployment
- Nginx Reverse Proxy

## Author

**Lingu Md**

MCA Graduate | Aspiring DevOps Engineer

Interested in DevOps, Cloud Computing, Linux, Docker, Kubernetes, AWS, CI/CD, and Full-Stack Development.
