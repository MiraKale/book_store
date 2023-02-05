package com.example.book_store.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "genres")
@Data
public class Genre {
    @Id
    @Column(name = "genreId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
//    @ManyToMany(mappedBy = "genres")
//    private Set<Book> books;
}
