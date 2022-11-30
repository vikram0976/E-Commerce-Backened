# E-Commerce-Backened


# REST API for an E-Commerce Application
<li>We have developed this REST API for an E-commerce application. This API performs
  all the fundamental CRUD operations of any ecommerce platform with user validation at every step.</li>
<li>This project is developed by me during project week in Masai School.</li>



.

# Collaborators

- [Vikram Chaurasia](https://github.com/vikram0976)


# Tech Stack
- Java
- Spring Framework
- Spring Boot
- Spring Data JPA
- MySQL
- Swagger UI
- Lambok
- Maven

# Modules

- Login Module
- Customer Module
- Category Module
- Product Module
- Cart Module
- Order and Bill Module

# Features

- Data Authentication and Validation for all the users (Admin owner, Customer)

## Admin Features
- Admin can login by giving valid credentials.
- Admin can add category and provide the item to the respective category. 
- Admin can add the status and set the price.


## Customer Features
- Customer can login in the application and update their information using their username and password.
- Customer can order item using by adding into cart and destination.
- Customer can access the bill after the purchase & can have the history is completed.


# Installation & Run
 - Before running the API server, you should update the database config inside the application.properties file.
- Update the port number, username and password as per your local database configuration.

```
    server.port=8888

    spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce;
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root
```

# API Root Endpoint
```
https://localhost:8800/
```
```
http://localhost:8800/swagger-ui/
```



