package org.example.java4n_fa25_sd20302.service;

import org.example.java4n_fa25_sd20302.entity.Category;
import org.example.java4n_fa25_sd20302.repository.CategoryRepository;

import java.util.List;

public class CategoryService {

    private CategoryRepository categoryRepository = new CategoryRepository();

    public List<Category> getCategories() {

        return categoryRepository.getCategories();
    }

    public Category getCategoryById(Long categoryId) {

        return categoryRepository.getCategoryById(categoryId);
    }
}
