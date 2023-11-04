# API REST with Spring Boot and JPA / Hibernate - running on railway

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/amac81/Javasbapi01/blob/main/LICENSE) 

# About the project

Javasbapi01 it's a Project developed in the Complete Java 2023 course - Object Oriented Programming + Projects.

##  Its objectives:

- Create a Spring Boot Java project;
- Implement the domain model;
- Structuring the application in logical layers: resource, service, repository;
- Configure and use the test database (H2)
- Populate the database with test data(seed);
- CRUD - Create, Retrieve, Update, Delete;
- Handling exceptions;

## Conceptual model
![Modelo Conceitual](https://github.com/amac81/Javasbapi01/blob/main/assets/raw/conceptual_model.png)

# Technologies used
## Back end
- Java
- Spring Boot
- H2
- PostgreSQL
- Maven
- Apache Tomcat
- Heroku

# Patterns used
- Layers pattern

# How to run the project

## Back end
Prerequisites: 
  - Java 17;
  - PostgreSQL database server;

```bash
# clone repository
git clone https://github.com/amac81/Javasbapi01.git

# run the project
./mvnw spring-boot:run (Linux, OSX, Solaris)

mvnw.cmd spring-boot:run (Windows)
```

# How to test the project

Prerequisites: 
  - Postman or Internet Browser;

### Endpoint for users

```bash

Examples:

# GET users

http://localhost:8080/users

# GET user by Id

http://localhost:8080/users/2

# POST user

http://localhost:8080/users

body
{
    "name": "Maria Betania",
    "email": "maryb@mail.com",
    "phone": "222322332",
    "password": "xx323243"
}

# DELETE user (by Id)

http://localhost:8080/users/2

# PUT user (update user by Id)

http://localhost:8080/users

body:
{
    "name": "Ava Apple",
    "email": "avaaple@mail.com",
    "phone": "12234223"
}
```

### Endpoint for orders

```bash

Examples:

# GET orders

http://localhost:8080/orders

# GET order by Id

http://localhost:8080/orders/3

# POST order

http://localhost:8080/orders

body
{
    "moment": "2023-07-26T12:09:22Z",
    "orderStatus": "WAITING_PAYMENT",
    "user": {
            "id": 1           
     }
}

# DELETE order (by Id)

http://localhost:8080/orders/4


# PUT order (update order by Id)

http://localhost:8080/orders

body
{
    "moment": "2023-07-26T12:09:22Z",
    "orderStatus": "CANCELED",
    "user": {
            "id": 2           
     }
}

```

### Endpoint for products

```bash

Examples:

# GET products

http://localhost:8080/products

# GET product by Id

http://localhost:8080/products/3

# POST product

http://localhost:8080/products

body
{
    "name": "Bicicleta SCOTT CONTESSA SPEEDSTER 25 DISC",
    "description": "A SCOTT Contessa Speedster 25 é uma leve, ágil e acessível bicicleta de estrada em alumínio. Com cabos totalmente integrados, esta bicicleta não só anda bem, como tem uma aparência espetacular!",
    "price": "37.22",
    "imgUrl": "http://wwww.bitclinic.pt/products/img8.jpg"
}

# DELETE product (by Id)

http://localhost:8080/products/1

# PUT product (update product by Id)

http://localhost:8080/products

body
{
    "name": "Bicicleta de Estrada SCOTT",
    "description": "A SCOTT Contessa Speedster 25 é uma leve, ágil e acessível bicicleta de estrada em alumínio. Com cabos totalmente integrados, esta bicicleta não só anda bem, como tem uma aparência espetacular!",
    "price": "3437.22",
    "imgUrl": "http://wwww.bitclinic.pt/products/img8.jpg"
}

```

### Endpoint for categories

```bash

Examples:

# GET categories

http://localhost:8080/categories

# GET category by Id

http://localhost:8080/categories/3

# POST category

http://localhost:8080/categories

body
{
    "name": "Health and Beauty"
}

# DELETE category (by Id)
http://localhost:8080/categories/2

# PUT category (update category by Id)

http://localhost:8080/categories

body
{
    "name": "Toys and Games"
}

```

# Author

Arnaldo Manuel de Almeida Canelas

https://www.linkedin.com/in/arnaldocanelas
