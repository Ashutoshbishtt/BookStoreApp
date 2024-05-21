package com.bookstore.utils;

public class InputValidator {
    // Method to validate an email address
    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    // Method to validate an ISBN (International Standard Book Number)
    public static boolean isValidISBN(String isbn) {
        return isbn.matches("[0-9]{13}");
    }

    // Method to validate a price (should be greater than 0)
    public static boolean isValidPrice(double price){
        return price > 0;
    }
}
