package com.example.book_store.controller;
import com.example.book_store.model.entity.Author;
import com.example.book_store.model.entity.Book;
import com.example.book_store.repository.AuthorRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AuthorController {

private final AuthorRepo authorRepo;

    public AuthorController(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @GetMapping("/authors/{id}")
    public Author getAuthor(@PathVariable Long id) {
        return authorRepo.findById(id).get();
    }

    @GetMapping("/authors/")
    public List<Author> getAll(){
        List<Author> authors =  authorRepo.findAll();
        return authors;
    }

}
