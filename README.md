# Products Category Service

Este proyecto es un microservicio desarrollado con Spring Boot que permite la gestión de productos dentro de categorías en una tienda online. El servicio proporciona una API RESTful para obtener los productos de una categoría específica mediante su `id_category`.

## Requisitos

- Java 17 o superior
- Maven
- Spring Boot
- Base de datos (se requiere configurar la conexión a la base de datos en el archivo `application.properties` o `application.yml`)

## Descripción

El microservicio permite la interacción con una base de datos para realizar las siguientes operaciones:

- **Obtener productos por categoría**: Recibe una solicitud GET a `/products/{id_category}` y devuelve todos los productos pertenecientes a una categoría específica.

## Estructura del Proyecto

El proyecto sigue una estructura basada en la arquitectura de capas, con las siguientes partes principales:

- **Controller**: Define los endpoints de la API. La clase `ProductController` expone el endpoint que permite obtener los productos por categoría.
- **Model**: Representa la entidad `Product` con los atributos necesarios como `id_product`, `name`, `description`, `price`, `id_category`, y `availability`.
- **Repository**: Implementa el acceso a la base de datos mediante Spring Data JPA. La interfaz `IProductRepository` define el método para consultar los productos por `id_category`.
- **Service**: Contiene la lógica de negocio. La clase `ProductService` implementa la interfaz `IProductService` y utiliza el repositorio para obtener los productos de la base de datos.

## API Endpoints

### GET `/products/{id_category}`

**Descripción**: Obtiene todos los productos que pertenecen a una categoría específica.

**Parámetros**:
- `id_category` (Path Parameter): ID de la categoría de los productos a obtener.

**Respuesta**:
- **Código de estado 200**: Devuelve una lista de productos pertenecientes a la categoría especificada.
- **Código de estado 404**: Si no se encuentran productos para la categoría proporcionada.
- **Código de estado 500**: En caso de error en el servidor.

**Ejemplo de respuesta**:

```json
[
  {
    "id_product": 1,
    "name": "Producto 1",
    "description": "Descripción del producto 1",
    "price": 100.0,
    "id_category": 1,
    "availability": true
  },
  {
    "id_product": 2,
    "name": "Producto 2",
    "description": "Descripción del producto 2",
    "price": 150.0,
    "id_category": 1,
    "availability": true
  }
]
