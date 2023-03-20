package com.example.book_store.service;

import com.example.book_store.model.entity.Book;

import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAllBook();

    Book updateBook(Book book, Long bookId);

    void deleteBookById(Long bookId);
}