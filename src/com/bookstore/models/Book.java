package com.bookstore.models;

/**
 * This class represents a Book in the bookstore.
 */
public class Book {
    // Fields for the book's title, ISBN, author, and price
    private String title;
    private String isbn;
    private String author;
    private double price;

    /**
     * Constructor to initialize a Book object with the given parameters.
     *
     * @param title  the title of the book
     * @param isbn   the ISBN number of the book
     * @param author the author of the book
     * @param price  the price of the book
     */
    public Book(String title, String isbn, String author, double price) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.price = price;
    }

    // Getter for the title
    public String getTitle() {
        return title;
    }

    // Setter for the title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for the ISBN
    public String getIsbn() {
        return isbn;
    }

    // Setter for the ISBN
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter for the author
    public String getAuthor() {
        return author;
    }

    // Setter for the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for the price
    public double getPrice() {
        return price;
    }

    // Setter for the price
    public void setPrice(double price) {
        this.price = price;
    }
}
