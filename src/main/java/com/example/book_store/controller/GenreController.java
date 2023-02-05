package com.example.book_store.controller;

import com.example.book_store.model.entity.Genre;
import com.example.book_store.repository.GenreRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GenreController {

    private final GenreRepo genreRepo;

    public GenreController(GenreRepo genreRepo) {
        this.genreRepo = genreRepo;
    }

    @GetMapping("/genre/{id}")
    public Genre getGenre(@PathVariable Long id) {
        return genreRepo.findById(id).get();
    }
}
