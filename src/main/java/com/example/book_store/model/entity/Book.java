package com.example.book_store.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    @Id
    @Column(name = "bookId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int year;
    private int pageCount;
    @ManyToMany
    @JoinTable(
            name = "books_authors",
            joinColumns = { @JoinColumn(name = "book_id") },
            inverseJoinColumns = { @JoinColumn(name = "author_id")}
    )
    private Set<Author> authors = new HashSet<>();
//    @ManyToMany
//    @JoinTable(
//            name = "books_genres",
//            joinColumns =  @JoinColumn(name = "book_id") ,
//            inverseJoinColumns =  @JoinColumn(name = "genre_id")
//    )
//    private Set<Genre> genres = new HashSet<>();

}
