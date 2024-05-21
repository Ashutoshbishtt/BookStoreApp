package com.bookstore;

import com.bookstore.models.Book;
import com.bookstore.models.User;
import com.bookstore.models.Order;
import com.bookstore.services.BookService;
import com.bookstore.services.OrderService;
import com.bookstore.services.UserServices;
import com.bookstore.utils.InputValidator;

import java.util.Scanner;

public class App {
    // Services for managing books, orders, and users
    private static BookService bookService = new BookService();
    private static OrderService orderService = new OrderService();
    private static UserServices userService = new UserServices();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            // Display menu options
            System.out.println("1. Add Book\n2. List Books\n3. Register User\n4. List Users\n5. Create Order\n6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    addBook(scanner); // Add a new book
                    break;
                case 2:
                    listBooks(); // List all books
                    break;
                case 3:
                    registerUser(scanner); // Register a new user
                    break;
                case 4:
                    listUsers(); // List all users
                    break;
                case 5:
                    createOrder(scanner); // Create a new order
                    break;
                case 6:
                    System.exit(0); // Exit the application
                    break;
                default:
                    System.out.println("Invalid choice, please try again"); // Handle invalid menu options
            }
        }
    }

    // Method to add a new book
    private static void addBook(Scanner scanner){
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        // Validate ISBN and price
        if(!InputValidator.isValidISBN(isbn) || !InputValidator.isValidPrice(price)) {
            System.out.println("Invalid input. Please try again");
            return;
        }

        // Create and add the book to the service
        Book book = new Book(title, isbn, author, price);
        bookService.addBook(book);
        System.out.println("Book added successfully!");
    }

    // Method to list all books
    private static void listBooks(){
        for(Book book : bookService.getAllBooks()){
            System.out.println(book);
        }
    }

    // Method to register a new user
    private static void registerUser(Scanner scanner){
        System.out.print("Enter user Id: ");
        String userId = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        // Validate email
        if(!InputValidator.isValidEmail(email)) {
            System.out.println("Invalid email. Please try again");
            return;
        }

        // Create and add the user to the service
        User user = new User(userId, name, email);
        userService.addUser(user);
        System.out.println("User registered successfully!");
    }

    // Method to list all users
    private static void listUsers() {
        for(User user : userService.getAllUsers()){
            System.out.println(user);
        }
    }

    // Method to create a new order
    private static void createOrder(Scanner scanner){
        System.out.print("Enter user Id: ");
        String userId = scanner.nextLine();
        User user = null;

        // Find the user by userId
        for(User u : userService.getAllUsers()){
            if(u.getUserId().equals(userId)){
                user = u;
                break;
            }
        }

        // If user is not found, prompt to register the user first
        if(user == null){
            System.out.println("User not found. Please register the user first");
            return;
        }

        System.out.print("Enter order Id: ");
        String orderId = scanner.nextLine();
        Order order = orderService.createOrder(orderId, user);

        while (true){
            System.out.print("Enter ISBN of the book to add (or type 'done' to finish): ");
            String isbn = scanner.nextLine();
            if(isbn.equalsIgnoreCase("done")){
                break;
            }

            Book book = null;
            // Find the book by ISBN
            for(Book b : bookService.getAllBooks()){
                if(b.getIsbn().equals(isbn)){
                    book = b;
                    break;
                }
            }

            // If book is not found, prompt to add the book first
            if(book == null){
                System.out.println("Book not found. Please add the book first.");
                continue;
            }

            // Add book to the order
            orderService.addBookToOrder(order, book);
            System.out.println("Book added to the order!");
        }
        // Display the total cost of the order
        System.out.println("Order created successfully! Total Cost: $" + orderService.calculateTotalCost(order));
    }
}
