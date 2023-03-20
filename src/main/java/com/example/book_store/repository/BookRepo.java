package com.example.book_store.repository;

import com.example.book_store.model.entity.Book;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepo extends JpaRepository<Book,Long> {
    @Query("SELECT b FROM Book b JOIN FETCH b.authors a join fetch b.characters c JOIN FETCH b.genres g")
    List<Book> findAll();
}
