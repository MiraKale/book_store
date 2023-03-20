package com.example.book_store.service.serviceImpl;

import com.example.book_store.model.entity.Book;
import com.example.book_store.repository.BookRepo;
import com.example.book_store.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {

    final BookRepo bookRepository;

    public BookServiceImpl(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public List<Book> findAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book updateBook(Book book, Long bookId) {
        return null;
    }

    @Override
    public void deleteBookById(Long bookId) {
    }

    public Book findBookById(long id){
        return bookRepository.findById(id).get();
    }
}
