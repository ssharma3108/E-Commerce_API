package com.example.commerce.service;


import com.example.commerce.model.Category;
import com.example.commerce.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;


    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


@GetMapping
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
