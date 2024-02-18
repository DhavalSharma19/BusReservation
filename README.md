# BusReservation

## Tech Stack Used:-

* Java
* Spring Framework
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL

## ER Diagram:-

![Screenshot 2024-02-17 215148](https://github.com/DhavalSharma19/BusReservation/assets/79095659/dff769b9-4835-4b90-a883-b64dabdca7ec)

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

* User Authentication & Validation with session uuid.



