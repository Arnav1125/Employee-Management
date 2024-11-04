# Employee Management System

## Overview

This Employee Management System is a web application developed using Spring Boot for the backend, MySQL for the database, and basic HTML, CSS, and JavaScript for the frontend. The application allows users to manage employee data effectively, including functionalities for adding, updating, deleting, and retrieving employee information.

## Features

- **Employee Management**: 
  - View all employees
  - Add new employee
  - Update existing employee details
  - Delete an employee
  - Search for employees by ID
  
- **User Authentication**:
  - Login functionality for users

## Technologies Used

- **Backend**: Spring Boot (Java)
- **Database**: MySQL
- **Frontend**: HTML, CSS, JavaScript
- **Build Tool**: Maven
- **Development Tools**: Spring Boot DevTools for rapid development

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or later
- Maven
- MySQL Database Server

### Installation

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   
### Access the Application:

- **Open your web browser and go to: http://localhost:8080/index.html**
  
### API Endpoints
## Employee Management Endpoints
## Method	Endpoint	Description
- **GET	/api/employees	Retrieve a list of all employees**
- **POST	/api/employees	Create a new employee**
- **PUT	/api/employees/{id}	Update an existing employee by ID**
- **DELETE	/api/employees/{id}	Delete an employee by ID**
### User Authentication Endpoints
## Method	Endpoint	Description
- **POST	/api/employees/login	Authenticate a user and log in**
