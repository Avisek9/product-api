# 🛒 Product API – Spring Boot REST API

A clean, production-ready **RESTful Product Management API** built using **Spring Boot**, documented with **Swagger (OpenAPI 3)**, and deployed live on **Render**.

This project demonstrates real-world backend development practices including layered architecture, validation, exception handling, API documentation, and cloud deployment.

---

## Live Deployment

- **Base URL:**  
  https://product-api-w0rr.onrender.com

- **Swagger UI (Live):**  
  https://product-api-w0rr.onrender.com/swagger-ui/index.html

---

## API Documentation (Swagger)

The API is fully documented using **Springdoc OpenAPI (Swagger)**.

With Swagger UI, you can:
- View all available endpoints
- Test APIs directly from the browser
- Inspect request and response schemas

Swagger is publicly accessible and requires **no authentication**.

---

## Features

- Full CRUD operations for products
- RESTful API design
- Input validation using `@Valid`
- Custom exception handling
- In-memory H2 database
- Swagger / OpenAPI 3 documentation
- Clean layered architecture
- Docker-ready application
- Deployed on Render (cloud)

---

## Tech Stack

- **Java 21**
- **Spring Boot**
- Spring Web
- Spring Data JPA
- Hibernate
- H2 Database
- Springdoc OpenAPI (Swagger)
- Maven
- Docker
- Render (Deployment)

---

## Available REST APIs

| HTTP Method | Endpoint                  | Description              |
|------------|---------------------------|--------------------------|
| POST       | `/api/products`           | Create a new product     |
| GET        | `/api/products`           | Fetch all products       |
| GET        | `/api/products/{id}`      | Fetch product by ID      |
| PUT        | `/api/products/{id}`      | Update product by ID     |
| DELETE     | `/api/products/{id}`      | Delete product by ID     |

All endpoints are **live**, **documented**, and **testable** via Swagger UI.
