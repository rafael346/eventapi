
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

Clone the project into local<p>

Installing the dependencies may be different depending on the ide you use.<p>
- If you use using VScode click [here](https://code.visualstudio.com/docs/java/java-build) to learn how to install maven dependencies on VScode.
- If you are using IntelliJ clicke [here](https://www.jetbrains.com/help/idea/work-with-maven-dependencies.html) to learn how to install maven dependencies on IntelliJ

Ater that jus clik on RUN button on your IDE<p>
The application runs on localhost:8080

## Endpoints
- ```GET /event```: Return a list of events<p>
- ```POST /event```: Create a new event<p>
- ```PUT /event/${id}```:  Update a event<p>
- ```Delete /event/${id}```: Delete a event<p>
