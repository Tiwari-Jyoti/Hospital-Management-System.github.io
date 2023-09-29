### System Overview

The healthcare system is designed to manage various aspects of a medical facility, with roles for both administrators and users (employees). The system utilizes Spring Boot for the server-side application and Angular for the frontend.

### Authentication and Security

Spring Security: The system employs Spring Security to manage authentication and authorization.

JWT (JSON Web Tokens) Authentication: JWT tokens are used for secure login and authentication.

### Server-Side (Spring Boot)
Server Implementation: The entire server-side application is developed using Spring Boot. This includes all APIs and backend logic.

Annotations Over XML: The configuration and setup of the Spring Boot application are annotation-driven, avoiding the use of XML files.

### Frontend (Angular)
Angular Frontend: The frontend is developed using Angular. It includes various pages such as Login, Home, and different functionalities for both administrators and users.

User Roles: The system has two roles: User and Admin. Users are akin to employees in the organization, while Admins have administrative privileges.

Search Functionality: The frontend features a search functionality facilitated by Angular Pipes, which allow users to search for specific information efficiently.

### Database (MySQL)
Database: Data is stored in a MySQL database with the name hms.

Configuration: The database connection details, including the username and password, are specified in the application.properties file in the Spring Boot application.

Port Configuration: The default MySQL port is 3306, but if your MySQL instance uses a different port, you can configure it in the application.properties file.

### Mandatory Setup
## Manual Database Setup
MySQL Database: You need to have MySQL installed and running. You can use MySQL Workbench or the MySQL 8.0 Command Line Client for database management.

Database Initialization: If the database doesn't exist, you can create it manually using SQL commands. For example:

##CREATE DATABASE IF NOT EXISTS hms;
After creating the database, start the Spring Boot server application.

Data Population: Insert data into the tables as required for the healthcare system to function correctly. This might include information about patients, doctors, appointments, or any other relevant data.

### Access Control
Admin Access: Administrators have full access to all functionalities within the system.

User Access: Users (employees) have access to most functionalities, but they are restricted from accessing certain pages such as Specialization, Department, and Employee details. If a user attempts to access these restricted pages through URLs, they will receive an "Unauthorized" message.

This healthcare system aims to provide a secure and efficient platform for managing healthcare-related data and operations, with clear distinctions between administrative and user roles for access control.

#### Existed Commands
- Goto Spring boot -> hms.sql And run this file in workbench.

#### Commands for database

insert into roles values(1, 'ROLE_USER');
insert into roles values(2, 'ROLE_ADMIN');

insert into users values(1, '$2a$10$nuyV4m3SpBYuqzdRvQK4iO1PI9O0SkLyHQP2YB8CFksVJirzGrDT2', 'admin'); **UserName: admin, Password : admin123**
insert into users values(2, '$2a$10$ef4yjYkFjmAjnQk/GPecK.VxaNmpe6yPfBoZh9dcW1.uzf1zFYemu', 'user');' **UserName: user, Password : user123**
**This is Encrypted Password**


insert into user_roles values(2, 1);<br>
insert into user_roles values(1, 2);<br>
