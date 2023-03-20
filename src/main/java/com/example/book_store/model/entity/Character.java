package com.example.book_store.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "characters")
@Getter
@Setter
public class Character {
    @Id
    @Column(name = "characterId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int age;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    @JsonIgnore
    private Book book;
}
