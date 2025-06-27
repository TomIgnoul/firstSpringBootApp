package com.tomignoul.store.service.category;

import com.tomignoul.store.model.Category;
import com.tomignoul.store.repository.category.CategoryRepository;

public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository categoryRepository;

    //constructor

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void addCategory(Category category){
        categoryRepository.save(category);
    }
}
