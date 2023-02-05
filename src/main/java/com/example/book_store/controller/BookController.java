package com.example.book_store.controller;
import com.example.book_store.model.entity.Book;
import com.example.book_store.repository.BookRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BookController {
private final BookRepo bookRepo;

    public BookController(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") Long id){
        Book book =  bookRepo.findById(id).get();
        return book;
    }

    @GetMapping("/books/")
    public List<Book> getAll(){
        List<Book> books =  bookRepo.findAll();
        return books;
    }

}
