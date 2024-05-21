package com.example.biblioteca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    
    public Author save(Author author) {
        return authorRepository.save(author);
    }
    
    public List<Author> findAll() {
        return authorRepository.findAll();
    }
    
    public Author findById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }
    
    public void deleteById(Long id) {
        authorRepository.deleteById(id);
    }
}
