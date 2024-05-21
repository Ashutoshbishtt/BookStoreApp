package com.bookstore.services;

import com.bookstore.models.Book;
import java.util.List;
import java.util.ArrayList;

public class BookService {
    // List to store books
    private List<Book> books = new ArrayList<>();

    // Method to add a book to the list
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to retrieve all books from the list
    public List<Book> getAllBooks() {
        return books;
    }
}
