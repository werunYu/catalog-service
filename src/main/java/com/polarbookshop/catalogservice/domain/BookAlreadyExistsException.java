package com.polarbookshop.catalogservice.domain;

/**
 * @author werun
 * @version 1.0
 * @date 2026/07/08 13:20
 * @description
 **/
public class BookAlreadyExistsException extends RuntimeException {

    public BookAlreadyExistsException(String isbn) {
        super("A book with ISBN " + isbn + " already exists.");
    }
}
