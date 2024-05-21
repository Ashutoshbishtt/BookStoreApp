package com.bookstore.services;

import com.bookstore.models.User;
import java.util.List;
import java.util.ArrayList;

public class UserServices {
    // List to store users
    private List<User> users = new ArrayList<>();

    // Method to add a user to the list
    public void addUser(User user) {
        users.add(user);
    }

    // Method to retrieve all users from the list
    public List<User> getAllUsers() {
        return users;
    }
}
