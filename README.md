# 🎦 Cinema Web App 🎦

## Project description

Cinema Web App is a simple RESTful web application, that supports user authentication, authorization, creating and searching cinema-halls in database,
new movies and available movie sessions, and, of course, ticket reservation. :)

## Functional scheme

![image](https://user-images.githubusercontent.com/79626945/223475729-99e227f8-d65e-48de-b874-f2ecbb28ed2b.png)

## Supported endpoints

These are implemented endpoints by this web application:

HTTP METHOD: /endpoint - (roles with needed authority) - request

* POST: /register - (all) - register as a new user.
* GET: /cinema-halls - (user/admin) - get a list of all cinema halls.
* POST: /cinema-halls - (admin) - create a new cinema hall.
* GET: /movies - (user/admin) - get a list of all movies.
* POST: /movies - (admin) - create a new movie.
* GET: /movie-sessions/available - (user/admin) - returns available movie sessions for specified movie and date.
* POST: /movie-sessions - (admin) - create movie session.
* PUT: /movie-sessions/{id} - (admin) - update movie session.
* DELETE: /movie-sessions/{id} - (admin) - delete movie session.
* GET: /orders - (user) - get list of orders for current user.
* POST: /orders/complete - (user) - create a new order for current user (transfer movie tickets from shopping cart to order and clear shopping cart).
* PUT: /shopping-carts/movie-sessions - (user) - creates a ticket for specified movie session and adds it to shopping cart of current user.
* GET: /shopping-carts/by-user - (user) - get shopping cart of current user.
* GET: /users/by-email - (admin) - get user by email.

## Technologies

- Java (JDK 17)
- Maven
- Spring Web MVC
- Spring Security
- Hibernate
- MySQL
- TomCat

## How to start application locally

- Install TomCat and MySQL.
- Clone this repo and open it.
- In db.properties file of resources folder change URL, username and password to correspond with yours.
- Edit Tomcat configurations to version 9.0.50 .
- To check if build was done succesfully - run 'mvn clean package' in terminal.
- Press run and enjoy the app!
- Should you have any questions, please contact me. 
- May I have the benefit of your thoughts on how to improve the app? Your feedback would be helpful :) 
 
