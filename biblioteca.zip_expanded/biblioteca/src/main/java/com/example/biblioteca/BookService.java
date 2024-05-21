package com.example.biblioteca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    
    public Book save(Book book) {
        return bookRepository.save(book);
    }
    
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
    
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
    
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
