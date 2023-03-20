package com.example.book_store.service;

import com.example.book_store.model.entity.Author;
import com.example.book_store.model.entity.Genre;

import java.util.List;


public interface GenreService {
    Genre save(Genre genre);

    List<Genre> findAllGenres();

    Genre updateGenre(Genre genre, Long genreId);

    void deleteGenreById(Long genreId);
}