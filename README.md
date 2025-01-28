# Products Category Service

This project is a microservice developed with Spring Boot that allows for the management of products within categories in an online store. The service provides a RESTful API to retrieve products of a specific category by its `id_category`.

## Requirements

- Java 17 or higher
- Maven
- Spring Boot
- Database (database connection configuration required in `application.properties` or `application.yml`)

## Description

The microservice interacts with a database to perform the following operations:

- **Get products by category**: Receives a GET request at `/products/{id_category}` and returns all products belonging to a specific category.

## Project Structure

The project follows a layered architecture structure, with the following main parts:

- **Controller**: Defines the API endpoints. The `ProductController` class exposes the endpoint that allows retrieving products by category.
- **Model**: Represents the `Product` entity with necessary attributes such as `id_product`, `name`, `description`, `price`, `id_category`, and `availability`.
- **Repository**: Implements database access using Spring Data JPA. The `IProductRepository` interface defines the method to query products by `id_category`.
- **Service**: Contains the business logic. The `ProductService` class implements the `IProductService` interface and uses the repository to get products from the database.

## API Endpoints

### GET `/products/{id_category}`

**Description**: Retrieves all products belonging to a specific category.

**Parameters**:
- `id_category` (Path Parameter): ID of the category of products to retrieve.

**Response**:
- **Status Code 200**: Returns a list of products belonging to the specified category.
- **Status Code 404**: If no products are found for the provided category.
- **Status Code 500**: In case of a server error.

**Example Response**:

```json
[
  {
    "id_product": 1,
    "name": "Product 1",
    "description": "Description of product 1",
    "price": 100.0,
    "id_category": 1,
    "availability": true
  },
  {
    "id_product": 2,
    "name": "Product 2",
    "description": "Description of product 2",
    "price": 150.0,
    "id_category": 1,
    "availability": true
  }
]
