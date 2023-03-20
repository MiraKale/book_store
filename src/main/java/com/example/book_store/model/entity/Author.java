package com.example.book_store.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "authors")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Author {
    @Id
    @Column(name = "author_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Date birthdate;
    @JsonIgnore
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();
}
