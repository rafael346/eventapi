
# Event API
  
Application designed to manage events, allowing the user to create, edit and delete events.

## How to Run

### Pre-requisites

#### Install JDK - Java Development Kit
Click [here](https://www.oracle.com/in/java/technologies/downloads/#java21) to install JDK
#### Install PostGreSQL
Click [here](https://www.postgresql.org/download/) to install PostGreSQL

#### PostGreSQL Configuration
Once you have installed and configured PostgreSQL to connect the database to the api, simply change the data in the file
```application-dev.properties```
  
```
spring.datasource.url=jdbc:postgresql://localhost:5432/YOUR_DATABASE_NAME
spring.datasource.username=postgres
spring.datasource.password=123456
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
jwt.secret=MYJWTSECRET
jwt.expiration=3600000
```


### Cloning and Running the Application in local

Clone the project into local



## Endpoints
- ```GET /event```: Return a list of events<p>
- ```POST /event```: Create a new event<p>
- ```PUT /event/${id}```:  Update a event<p>
- ```Delete /event/${id}```: Delete a event<p>
