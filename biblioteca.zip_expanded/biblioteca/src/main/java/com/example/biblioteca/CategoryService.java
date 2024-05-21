package com.example.biblioteca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    
    public Category save(Category category) {
        return categoryRepository.save(category);
    }
    
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
    
    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }
    
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }
}
