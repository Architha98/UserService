# Microservices Architecture using Spring Boot & Spring Cloud

## 📌 Project Overview
This project demonstrates a **Microservices Architecture** built using **Spring Boot** and **Spring Cloud**.  
Each microservice is independently deployable and communicates through service discovery and an API Gateway.

The project focuses on **scalability, fault tolerance, and centralized configuration**, following real-world enterprise standards.

---

## 🏗 Architecture Diagram (Logical)
Client  
→ API Gateway  
→ Service Discovery (Eureka)  
→ Individual Microservices  
→ Databases (per service)

---

## 🧩 Microservices Included

### 1️⃣ Service Registry
- **Eureka Server**
- Handles service registration & discovery
- Enables dynamic service lookup

---

### 2️⃣ API Gateway
- **Spring Cloud Gateway**
- Acts as a single entry point
- Routes requests to appropriate microservices
- Provides filtering and basic security handling

---

### 3️⃣ Config Server
- **Spring Cloud Config Server**
- Centralized configuration management
- Supports different environments (dev, qa, prod)

---

### 4️⃣ Business Microservices
Example:
- User Service  
- Order Service  

Each service:
- Is a standalone Spring Boot application
- Has its own database
- Communicates using REST APIs
- Registers with Eureka Server

---

##
