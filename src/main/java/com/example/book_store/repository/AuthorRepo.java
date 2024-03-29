package com.example.book_store.repository;

import com.example.book_store.model.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepo extends JpaRepository<Author,Long> {

    @Query(value = "select a from Author a where a.name = 'Leo'")
    List<Author> customQuery();
}
