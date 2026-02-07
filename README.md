# Product API (Spring Boot)

A simple RESTful backend application built using **Spring Boot** for managing products (e-commerce style).

## Tech Stack
- Java 21
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Lombok
- Maven

## Features
- Create Product (POST)
- Get All Products (GET)
- Get Product by ID (GET)
- Update Product (PUT)
- Delete Product (DELETE)
- Input Validation

## API Endpoints

| Method | Endpoint | Description |
|------|--------|------------|
| POST | `/api/products` | Create product |
| GET | `/api/products` | Get all products |
| GET | `/api/products/{id}` | Get product by ID |
| PUT | `/api/products/{id}` | Update product |
| DELETE | `/api/products/{id}` | Delete product |

## Database
Uses **H2 in-memory database**.  
Data is reset when the application restarts.

## Run Locally
```bash
mvn spring-boot:run
