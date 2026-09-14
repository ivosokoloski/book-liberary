# 📚 Book Library

A simple full-stack application to track and manage books and authors. This project was done within the framework of the CI/CD subject of FCSE (FINKI).
Built with React (+ TypeScript), Java + Spring Boot (REST API), and PostgreSQL.
The project demonstrates containerization with Docker, orchestration with Docker Compose, CI/CD pipeline via GitHub Actions, and Kubernetes deployment.

---

## 📌 Features

### Backend (Spring Boot + PostgreSQL)
* CRUD operations for books, authors, and user authentication (JWT)
* Spring Data JPA / Hibernate for database access
* Connected to PostgreSQL database

### Frontend (React + TypeScript)
* Interactive UI to manage library catalog
* Token-based authentication integration
* Clean and responsive user interface

### Database (PostgreSQL)
* Stores book details, categories, authors, and user credentials
* Relational database design running on PostgreSQL 15

### DevOps & Orchestration
* Docker containerization (Multi-stage builds)
* Kubernetes manifests for production-ready deployment
* Automated CI/CD pipeline via GitHub Actions

---

## 🚀 Getting Started

### 1. Run locally with Docker Compose

1. Clone the repository:
   git clone https://github.com/IvoSokoloski/book-library.git
   cd book-library

2. Create a .env file in the root directory:
   POSTGRES_DB=bookdb
   POSTGRES_USER=postgres
   POSTGRES_PASSWORD=postgrespassword
   SPRING_DATASOURCE_URL=jdbc:postgresql://postgres-db:5432/bookdb
   JWT_SECRET_KEY=7ac51f34954d17b2c22a1a95ea44f1f61c72a0b87d186c8e2c607edb4db99ffd

3. Run with Docker Compose:
   docker-compose up --build

Services will be available at:
* Frontend -> http://localhost:80
* Backend API -> http://localhost:8080
* PostgreSQL -> localhost:5432

---

### 2. Development without Docker

1. Start PostgreSQL locally and create the database `bookdb`.
2. Configure database credentials in `backend/src/main/resources/application.properties`.
3. Install dependencies & run backend:
   cd backend
   mvn spring-boot:run

4. Install dependencies & run frontend:
   cd frontend
   npm install
   npm start

---

## ⚙️ CI/CD Pipeline (GitHub Actions)

Automated pipeline via GitHub Actions to build and push Docker images to Docker Hub.  
Workflow file: .github/workflows/docker-ci.yml

### What it does:
* Triggers on push or pull_request to main or master branches
* Builds backend (Java/Spring Boot) and frontend (React) images
* Pushes images to Docker Hub under your account

### Setup:
1. Create a Docker Hub Personal Access Token.
2. Add the following repository secrets in GitHub (Settings -> Secrets and variables -> Actions):
   * DOCKERHUB_USERNAME -> Your Docker Hub username
   * DOCKERHUB_TOKEN -> Your Personal Access Token

---

## ☸️ Kubernetes Deployment

This repository contains declarative Kubernetes manifests for production-ready deployment with k3d.

### 🏗️ Architecture
* Namespace: `book-library-ns` for complete resource isolation
* Frontend: React application served by Nginx (Deployment + ClusterIP Service)
* Backend: Spring Boot REST API (Deployment + ClusterIP Service)
* Database: PostgreSQL 15 with 1Gi PersistentVolumeClaim (StatefulSet + ClusterIP Service)
* Config & Secrets: ConfigMap for non-sensitive data and Secret for credentials
* Ingress: NGINX Ingress Controller for routing external traffic

---

### 🚀 Quick Kubernetes Setup

1. Create k3d Cluster:
   k3d cluster create book-cluster --port "80:80@loadbalancer" --port "443:443@loadbalancer" --agents 1

2. Install NGINX Ingress Controller:
   kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/controller-v1.8.1/deploy/static/provider/cloud/deploy.yaml
   
   kubectl wait --namespace ingress-nginx --for=condition=ready pod --selector=app.kubernetes.io/component=controller --timeout=120s

3. Deploy Manifests to Kubernetes:
   kubectl apply -f k8s/manifests.yaml

4. Wait for Database to be ready:
   kubectl wait --for=condition=ready pod/postgres-db-0 -n book-library-ns --timeout=120s

5. Configure Local DNS:  
   Add the following line to your /etc/hosts (Linux/macOS) or C:\Windows\System32\drivers\etc\hosts (Windows - Run as Administrator):
   127.0.0.1 book-library.local

6. Access the Application:  
   Open your browser and navigate to: http://book-library.local

---

## 📁 Kubernetes Manifest Structure

All Kubernetes resources are consolidated inside k8s/manifests.yaml:

| Resource | Name | Description |
| :--- | :--- | :--- |
| Namespace | book-library-ns | Logical isolation for all application resources |
| ConfigMap | app-config | Application environment configuration |
| Secret | app-secrets | Sensitive DB credentials and JWT secret key |
| StatefulSet | postgres-db | PostgreSQL deployment with persistent storage |
| Services | postgres-service, backend-service, frontend-service | ClusterIP internal network services |
| Deployments | backend-deployment, frontend-deployment | Pod management for Backend and Frontend |
| Ingress | book-library-ingress | Ingress routing configuration for external access |

---

## 🔧 Kubernetes Management Commands

### Check Application Status
kubectl get all -n book-library-ns
kubectl get pods -n book-library-ns
kubectl get svc,ingress -n book-library-ns

### View Logs
kubectl logs -f deployment/backend-deployment -n book-library-ns
kubectl logs -f deployment/frontend-deployment -n book-library-ns
kubectl logs -f statefulset/postgres-db -n book-library-ns

### Scaling Services
kubectl scale deployment backend-deployment --replicas=3 -n book-library-ns
kubectl scale deployment frontend-deployment --replicas=2 -n book-library-ns

---

## 📁 Project Structure

book-library/
├── backend/
│   ├── Dockerfile
│   ├── pom.xml
│   └── src/
├── frontend/
│   ├── Dockerfile
│   ├── package.json
│   └── src/
├── k8s/
│   └── manifests.yaml
├── .github/workflows/
│   └── docker-ci.yml
├── .env
├── docker-compose.yml
└── README.md

---

## 🔐 Security Notes
* Secrets and sensitive environment variables are strictly excluded from source control using .env and Git environment secrets.
* All inter-service communications operate strictly via internal ClusterIP services.
* External access is exposed securely through the Ingress controller routing.

---

## 🎯 Deployment Options Summary

| Method | Use Case | Command |
| :--- | :--- | :--- |
| Docker Compose | Local development & testing | docker-compose up --build |
| Kubernetes (k3d) | Production-grade cluster testing | kubectl apply -f k8s/manifests.yaml |
| CI/CD Pipeline | Automated build & publish | git push origin main |

---

## 👨‍💻 Author

**Иво Соколоски (Ivo Sokoloski)**  
* Index:   233229
* Faculty of Computer Science and Engineering (FINKI) - Skopje  
