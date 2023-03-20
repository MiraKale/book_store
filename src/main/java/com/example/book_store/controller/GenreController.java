package com.example.book_store.controller;

import com.example.book_store.model.entity.Book;
import com.example.book_store.model.entity.Genre;
import com.example.book_store.repository.GenreRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class GenreController {

    private final GenreRepo genreRepo;

    public GenreController(GenreRepo genreRepo) {
        this.genreRepo = genreRepo;
    }

    @GetMapping("/genres/{id}")
    public Genre getGenre(@PathVariable Long id) {
        return genreRepo.findById(id).get();
    }

    @GetMapping("/genres/")
    public List<Genre> getAll(){
        List<Genre> genres =  genreRepo.findAll();
        System.out.println(genres);

        return genres;
    }
}
