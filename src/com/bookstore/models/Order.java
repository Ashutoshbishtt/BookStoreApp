package com.bookstore.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    // Fields to store order information
    private String orderId;
    private User user;
    private List<Book> books;
    private double totalCost;

    // Constructor to initialize a new Order object
    public Order(String orderId, User user) {
        this.orderId = orderId;
        this.user = user;
        this.books = new ArrayList<>(); // Initialize the books list
        this.totalCost = 0.0; // Initialize the total cost to zero
    }

    // Method to add a book to the order and update the total cost
    public void addBook(Book book) {
        books.add(book); // Add the book to the list
        totalCost += book.getPrice(); // Update the total cost
    }

    // Getter for totalCost
    public double getTotalCost() {
        return totalCost;
    }

    // Getter and Setter for orderId
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    // Getter and Setter for user
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Getter and Setter for books
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    // Overriding the toString() method to provide a string representation of the Order object
    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", user=" + user +
                ", books=" + books +
                ", totalCost=" + totalCost +
                '}';
    }
}
