# BusReservation

This is a Backend Application that enables users to book bus tickets online. The system will allow users to book available buses based on their source and destination cities, reserve seats, and cancel their reserved seats. It also provides admin to manage other users, buses and their routes.

Video Explanation - https://drive.google.com/file/d/1aRTKey0e1qIWqc8ykD5wcUiP7439h8zJ/view?usp=sharing  <br/>
<br/>
If above link not working try - https://www.dropbox.com/scl/fi/5jwmvs3x4hwocfzwh1z50/Project-Explanation.mp4?rlkey=l1s45ob92elmuel84nykhdlo7&dl=0

## Tech Stack Used:-

* Java
* Spring Framework
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL

## FlowChart:-

![Screenshot 2024-02-18 143654](https://github.com/DhavalSharma19/BusReservation/assets/79095659/b31e41c7-3394-4860-853b-186747b589df)

## ER Diagram:-

![Screenshot 2024-02-17 215148](https://github.com/DhavalSharma19/BusReservation/assets/79095659/dff769b9-4835-4b90-a883-b64dabdca7ec)

## Structure and Modules: 

![Screenshot 2024-02-18 111026](https://github.com/DhavalSharma19/BusReservation/assets/79095659/c873170a-96f1-4c7c-bcca-8b4ce40c4a02)
![Screenshot 2024-02-18 111042](https://github.com/DhavalSharma19/BusReservation/assets/79095659/2ab966a1-2abc-4231-9c13-20a7a9941048)
<br/>
![Screenshot 2024-02-18 111158](https://github.com/DhavalSharma19/BusReservation/assets/79095659/f4ca1335-4713-4ef9-88f8-895beb24ccc1)
![Screenshot 2024-02-18 111015](https://github.com/DhavalSharma19/BusReservation/assets/79095659/675a849e-bdd8-41d5-9431-3c198c9e7c76)

## Features:-

### Admin Features:

* Administrator Role of the entire application.
* Only registered admins with valid session token can add/update/delete routes and buses from the main database.
* Admin can access the details of different users and reservations.

### User Features:

* Register themselves with the application and log in to get the valid session token.
* Viewing the list of available buses and booking/cancelling a reservation.
* Only logged-in user can access their reservations, profile updation, and other features.

### Seat Availability:

* Based on the Seat Occupancy shows colour in green, yellow and red based on 60% or less occupancy percentage, between 60% and 90% occupancy and greater than 90% occupancy respectively. 

* Takes Bus Id as an argument to show the colour for the relevant bus by returning a string.

![Screenshot 2024-02-18 085115](https://github.com/DhavalSharma19/BusReservation/assets/79095659/7d15751e-4ba2-4888-9ffd-e5aa8c50db6b)

### Authentication:

* Admin Authentication & Validation with session uuid.

The nextBytes() method of java.security.SecureRandom class is used to generate a user-specified number of random bytes.<br/>

Base64 is a binary to a text encoding scheme that represents binary data in an American Standard Code for Information Interchange (ASCII) string format. It's designed to carry data stored in binary format across the channels, and it takes any form of data and transforms it into a long string of plain text.

![Screenshot 2024-02-18 095246](https://github.com/DhavalSharma19/BusReservation/assets/79095659/762103c5-6ad0-4140-9b20-2bb2d1d26572)

At the time of logout the session is deleted from the repository. <br/>
![Screenshot 2024-02-18 095258](https://github.com/DhavalSharma19/BusReservation/assets/79095659/43e2228c-1932-417a-a44a-0aa44cc2e617)

* User Authentication & Validation with session uuid.

The nextBytes() method of java.security.SecureRandom class is used to generate a user-specified number of random bytes.<br/>

Base64 is a binary to a text encoding scheme that represents binary data in an American Standard Code for Information Interchange (ASCII) string format. It's designed to carry data stored in binary format across the channels, and it takes any form of data and transforms it into a long string of plain text.

![Screenshot 2024-02-18 093846](https://github.com/DhavalSharma19/BusReservation/assets/79095659/d9da77cd-dc99-4623-9003-a66f992d5f80)

At the time of logout the session is deleted from the repository. <br/>
![Screenshot 2024-02-18 093934](https://github.com/DhavalSharma19/BusReservation/assets/79095659/0df31620-71d9-46a5-8283-a8f03d56f639)

### Error and Exception Handling:

Meticulous attention has been dedicated to ensuring robust exception handling at every step of the application's execution. Through the implementation of various error-handling mechanisms, including custom exception classes, global exception handlers, and precise logging, I have fortified the system against unexpected faults. <br/>

Each module of the project incorporates thorough validation checks and graceful error responses to preemptively address potential issues. Furthermore, the use of Spring's declarative transaction management allows for the effective rollback of transactions in the event of failures, maintaining data integrity. <br/>

![Screenshot 2024-02-18 105622](https://github.com/DhavalSharma19/BusReservation/assets/79095659/7983a5f7-4b1d-451f-a623-319a9c83529b)

The comprehensive exception and fault-handling strategy not only enhances the overall reliability of the system but also facilitates rapid diagnosis and resolution of issues, contributing to a more resilient and maintainable Spring Boot application.

Some Examples:
![Screenshot 2024-02-18 110024](https://github.com/DhavalSharma19/BusReservation/assets/79095659/7608d464-ce2b-439f-b6aa-80d1e032c481)
![Screenshot 2024-02-18 110044](https://github.com/DhavalSharma19/BusReservation/assets/79095659/d2863089-7b4b-4cac-a97b-7b2ce855186c)
![Screenshot 2024-02-18 110111](https://github.com/DhavalSharma19/BusReservation/assets/79095659/cc52a168-46ba-41d5-a439-05ac6d049032)

### Object Oriented Programming Language:

 I employed Java to implement key object-oriented programming (OOP) principles, particularly focusing on method overriding and inheritance. <br/>

The principles of inheritance were applied to extend base classes. This approach not only ensured code reusability but also allowed for the polymorphic behavior of objects. Through the use of OOP principles like encapsulation, inheritance, and method overriding, the project achieved a well-organized and extensible structure, facilitating easier maintenance and future expansions.

### Trade-Offs in System:

I used MySQL, a popular open-source relational database management system (RDBMS), for this application.

#### Performance vs. Scalability:

* Strength: MySQL is known for its good performance for smaller to medium-sized databases.
* Trade-off: As the size of the database and the complexity of queries increase, MySQL may face scalability challenges compared to some other database systems designed for massive scalability, such as NoSQL databases.

#### ACID Compliance:

* Strength: MySQL is ACID compliant, ensuring data consistency and reliability.
* Trade-off: Achieving full ACID compliance can impact performance, especially in scenarios where high transaction throughput is required.

#### Schema Changes:

* Strength: MySQL supports SQL and has a well-defined schema, providing data integrity and a clear structure.
* Trade-off: Schema changes can be cumbersome and may require downtime in some cases. This can be a challenge in situations where the application demands frequent and dynamic schema changes.

#### Flexibility and NoSQL Features:

* Strength: While MySQL is primarily a relational database, it has introduced features to support NoSQL-like functionality with technologies like the JSON data type.
* Trade-off: Full NoSQL databases may offer more flexibility in handling unstructured data compared to MySQL's hybrid approach.

#### Replication and High Availability:

* Strength: MySQL provides replication features for creating high availability setups and read scaling.
* Trade-off: Setting up and managing replication can be complex, and automatic failover might not be as seamless as in some other databases.

#### Storage Engines: 
The underlying software component that a database management system (DBMS) uses to create, read, update and delete (CRUD) data from a database.

* Strength: MySQL supports multiple storage engines, each with its own strengths.
* Trade-off: The choice of storage engine can impact performance and features, but not all engines may be suitable for every use case.

#### Security:

* Strength: MySQL has robust security features, including user authentication, access controls, and encryption.
* Trade-off: Properly configuring and managing security settings is crucial, and misconfigurations can lead to vulnerabilities.

Used Spring Boot as it offers several advantages that make it a popular choice for developing Java-based applications, particularly in the context of microservices and modern web development.

#### Rapid Development: 
* Spring Boot's convention-over-configuration approach and a wide range of pre-built templates enable developers to start coding quickly. It reduces boilerplate code, allowing developers to focus on business logic rather than spending time on configuration.
#### Embedded Web Servers: 
* Spring Boot includes support for embedded web servers like Tomcat, Jetty, and Undertow. This eliminates the need for external server deployment, simplifying the deployment process and making applications more self-contained.
#### Microservices Support:
* Spring Boot is well-suited for building microservices architectures. It provides features like embedded web servers, easy configuration management, and support for building RESTful APIs, making it easier to develop and deploy microservices.
#### Auto-Configuration: 
* Spring Boot leverages auto-configuration to automatically set up application components based on project dependencies. This reduces manual configuration efforts and helps adhere to best practices.
#### Dependency Injection and Inversion of Control (IoC): 
* Spring Boot builds on the core concepts of the Spring framework, emphasizing dependency injection and IoC. This promotes modular and maintainable code by reducing tight coupling between components.
#### Easy Testing: 
* Spring Boot applications are designed with testability in mind. The framework provides support for unit testing, integration testing, and end-to-end testing, making it easier to write robust and reliable test suites.

Some tradeoffs were Increased Jar/War Size, and while convention-over-configuration is a strength for rapid development, it might be a trade-off for developers who prefer more explicit configuration. Some developers might find it challenging to understand the implicit conventions, especially when troubleshooting issues.

### Swagger UI:

#### API Root Endpoint
http://localhost:8999/swagger-ui/index.html#/

![Screenshot 2024-02-18 175514](https://github.com/DhavalSharma19/BusReservation/assets/79095659/6f9bcd60-d5aa-4d64-a199-630e96e5f0e8)
![Screenshot 2024-02-18 175525](https://github.com/DhavalSharma19/BusReservation/assets/79095659/8f88203d-f0b5-402c-bd7d-a350587269f5)
![Screenshot 2024-02-18 175536](https://github.com/DhavalSharma19/BusReservation/assets/79095659/e9d84361-ae4b-4803-8608-14bec40b98ed)
![Screenshot 2024-02-18 175546](https://github.com/DhavalSharma19/BusReservation/assets/79095659/220aa32b-cc9a-40dd-b406-27c70d341aa3)
![Screenshot 2024-02-18 175556](https://github.com/DhavalSharma19/BusReservation/assets/79095659/81508986-93a0-4aab-bab9-7fa9ed3f5895)
![Screenshot 2024-02-18 175606](https://github.com/DhavalSharma19/BusReservation/assets/79095659/0b476b16-b53d-44da-9e90-193d3cb1bbe6)
