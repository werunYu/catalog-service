package com.polarbookshop.catalogservice.domain;

/**
 * @author werun
 * @version 1.0
 * @date 2026/07/08 13:21
 * @description
 **/
public class BookNotFoundException extends RuntimeException{

    public BookNotFoundException(String isbn) {
        super("The book with ISBN " + isbn + " was not found.");
    }
}
