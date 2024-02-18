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

The nextBytes() method of java.security.SecureRandom class is used to generate a user-specified number of random bytes.<br/>

Base64 is a binary to a text encoding scheme that represents binary data in an American Standard Code for Information Interchange (ASCII) string format. It's designed to carry data stored in binary format across the channels, and it takes any form of data and transforms it into a long string of plain text.

![Screenshot 2024-02-18 095246](https://github.com/DhavalSharma19/BusReservation/assets/79095659/762103c5-6ad0-4140-9b20-2bb2d1d26572)

At the time of logout the session is deleted from the repository.
![Screenshot 2024-02-18 095258](https://github.com/DhavalSharma19/BusReservation/assets/79095659/43e2228c-1932-417a-a44a-0aa44cc2e617)

* User Authentication & Validation with session uuid.

The nextBytes() method of java.security.SecureRandom class is used to generate a user-specified number of random bytes.<br/>

Base64 is a binary to a text encoding scheme that represents binary data in an American Standard Code for Information Interchange (ASCII) string format. It's designed to carry data stored in binary format across the channels, and it takes any form of data and transforms it into a long string of plain text.

![Screenshot 2024-02-18 093846](https://github.com/DhavalSharma19/BusReservation/assets/79095659/d9da77cd-dc99-4623-9003-a66f992d5f80)

At the time of logout the session is deleted from the repository.
![Screenshot 2024-02-18 093934](https://github.com/DhavalSharma19/BusReservation/assets/79095659/0df31620-71d9-46a5-8283-a8f03d56f639)

