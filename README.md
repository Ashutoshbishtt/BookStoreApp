````markdown
# Mini Online Bookstore System

## Overview
This project is a simplified version of an online bookstore system, implemented in Java. It includes functionalities for managing books, users, and orders. The system is designed using object-oriented principles and does not use a GUI or database backend. Instead, it operates through a command-line interface and stores data in memory.

## Features
- **Book Management:**
  - Add a new book to the inventory.
  - Display a list of available books.
- **User Management:**
  - Register a new user.
  - Display a list of registered users.
- **Order Management:**
  - Allow users to add books to their shopping cart.
  - Allow users to place an order.
  - Calculate the total cost of the order.

## Project Structure
src/
  main/
    java/
      com/bookstore/
        models/
          Book.java
          User.java
          Order.java
        services/
          BookService.java
          UserService.java
          OrderService.java
        utils/
          InputValidator.java
        App.java

## Prerequisites
  - Java Development Kit (JDK) 8 or higher.
  - An IDE such as IntelliJ IDEA, Eclipse, or VS Code (optional but recommended).

## Setup Instructions
 - 1)Clone the Repository:
  - https://github.com/Ashutoshbishtt/BookStoreApp.git
- 2)Open the Project in Your IDE:
  - Open `src` directory.
- 3)Compile the Project:
  - If you are using an IDE, the project will compile automatically. If you prefer to use the command line, navigate to the src directory and run:
      -javac -d out/production/classes $(find . -name "*.java")
 - 4)Run the Application::
  - From your IDE, run the App class located in com/bookstore.
  - Alternatively, from the command line, navigate to the src directory and run:
    - java -cp out/production/classes com.bookstore.App
  

## How to Use
Once the application is running, you will see a command-line menu with options:
- **Add Book:**
  - Enter ISBN, title, author, and price when prompted.
- **List Books:**
  - Displays a list of all books currently in the inventory.
- **Register User:**
  - Enter user ID, name, and email when prompted.
- **List Users:**
  - Displays a list of all registered users.
- **Create Order:**
  - Enter user ID to create an order for a specific user.
  - Enter order ID.
  - Add books to the order by entering their ISBNs.
  - Type done to finish adding books to the order.
  - The total cost of the order will be displayed.
- **Exit:**
  - Exit the application.

