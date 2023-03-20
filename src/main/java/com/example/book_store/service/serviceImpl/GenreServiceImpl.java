package com.example.book_store.service.serviceImpl;

import com.example.book_store.model.entity.Genre;
import com.example.book_store.repository.GenreRepo;
import com.example.book_store.service.GenreService;

import java.util.List;

public class GenreServiceImpl implements GenreService {

    final GenreRepo repo;

    public GenreServiceImpl(GenreRepo repo) {
        this.repo = repo;
    }

    @Override
    public Genre save(Genre genre) {
        return repo.save(genre);
    }

    @Override
    public List<Genre> findAllGenres() {
        return null;
    }

    @Override
    public Genre updateGenre(Genre genre, Long genreId) {
        return null;
    }

    @Override
    public void deleteGenreById(Long genreId) {

    }
}
