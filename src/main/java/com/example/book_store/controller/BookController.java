package com.example.book_store.controller;

import com.example.book_store.model.entity.Book;
import com.example.book_store.service.serviceImpl.BookServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookServiceImpl bookService;
    private final ObjectMapper objectMapper;


    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookService.findBookById(id);
    }

    @GetMapping("/books/")
    public List<Book> getAll(HttpServletRequest request) throws IOException {

            String req = objectMapper.readValue(request.getReader().lines().collect(Collectors.joining(System.lineSeparator())), String.class);


        return bookService.findAllBook();
    }
    @ExceptionHandler(IOException.class)
    public String handleException(IOException e) {
        return "ye nen";
    }

}
