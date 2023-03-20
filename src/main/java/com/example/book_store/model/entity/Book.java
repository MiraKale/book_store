package com.example.book_store.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int year;
    private int pageCount;
    @ManyToMany
    @JoinTable(
            name = "books_authors",
            joinColumns = {@JoinColumn(name = "book_id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id")}
    )
    private Set<Author> authors = new HashSet<>();
    @ManyToMany
    @JoinTable(
            name = "books_genres",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private Set<Genre> genres = new HashSet<>();
    @OneToMany(mappedBy = "book")
    private List<Character> characters = new ArrayList<>();



}
