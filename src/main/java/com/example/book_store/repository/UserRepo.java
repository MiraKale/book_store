package com.example.book_store.repository;

import com.example.book_store.model.entity.Author;
import com.example.book_store.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String username);
}