package com.polarbookshop.catalogservice.domain;

import java.util.Optional;

/**
 * @author werun
 * @version 1.0
 * @date 2026/07/08 13:00
 * @description
 **/
public interface BookRepository {

    Iterable<Book> findAll();

    Optional<Book> findByIsbn(String isbn);

    boolean existByIsbn(String isbn);

    Book save(Book book);

    void deleteByIsbn(String isbn);
}
