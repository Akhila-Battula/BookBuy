# BookBuy
Book Buy is an online book shopping website.

Features
--------
### User perspective
- Easy login & registration
- Product filtering based on category
- Product gallery
- Shopping cart
- Order summary
- Payments using Paypal

### Administrator perspective
- Easy login
- Pages (add, edit, delete, sort)
- Products (add, edit, delete)
- Categories (add, edit, delete, sort)

Tools used
-----------
- Java 11
- Spring Boot
- Maven 
- MySQL Workbench 8.0.28
- Thymeleaf
- Spring Security and roles
- Spring Data Jpa

Database Setup
---------------
### ER Diagram:
![image](https://user-images.githubusercontent.com/28950128/173207570-3f3f2a20-4e00-40c2-a43b-1021c4856664.png)

### Using MySql Workbench:
- Create a new schema name `bookbuy`
- Use the bookbuy_queries.sql file to dump the tables and data.

Database Configuration in Spring Boot
-------------------------------------
Change database connection config in 

`bookbuy/src/main/resources/application.properties`
`restapi/src/main/resources/application.properties`
`restclient/src/main/resources/application.properties`
```
spring.datasource.url=jdbc:mysql://localhost/bookbuy
spring.datasource.username=root
spring.datasource.password=
```

Project Setup
-------------
- Clone and open in Eclipse (other IDE is also fine, make sure that spring boot plugin is installed)
- Change database connection config in `src/main/resources/application.properties`
- Install maven dependencies using IDE auto import or using the command ``mvn install``
- Run the app using ``mvn spring-boot:start`` from project root directory.
- Browse http://localhost:8080/ or http://localhost:8080/admin/pages

Application Launch page
-------------

![image](https://user-images.githubusercontent.com/28950128/173208121-fd6b0132-bce4-4e9d-9a95-9fe0cf2c551a.png)
