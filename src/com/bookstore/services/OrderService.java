package com.bookstore.services;

import com.bookstore.models.Book;
import com.bookstore.models.Order;
import com.bookstore.models.User;

import java.util.List;
import java.util.ArrayList;

public class OrderService {
    // List to store orders
    private List<Order> orders = new ArrayList<>();

    // Method to create a new order and add it to the orders list
    public Order createOrder(String orderId, User user) {
        Order order = new Order(orderId, user);
        orders.add(order);
        return order;
    }

    // Method to add a book to an existing order
    public void addBookToOrder( Order order,Book book) {
        order.addBook(book);
    }

    // Method to calculate the total cost of an order
    public double calculateTotalCost(Order order) {
        return order.getTotalCost();
    }
}
