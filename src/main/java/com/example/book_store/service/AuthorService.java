package com.example.book_store.service;

import com.example.book_store.model.entity.Author;
import com.example.book_store.model.entity.Book;

import java.util.List;

public interface AuthorService {
    Author save(Author author);

    List<Author> findAllAuthors();

    Author updateAuthor(Author author, Long authorId);

    void deleteAuthorById(Long authorId);
}