package com.smy.ecommerce.service.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smy.ecommerce.entities.concretes.Category;
import com.smy.ecommerce.repository.abstracts.CategoryRepository;
import com.smy.ecommerce.service.abstracts.CategoryService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {

    private CategoryRepository repository;

    @Override
    public List<Category> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Category getById(int id) {
        return this.repository.findById(id).get();
    }

    @Override
    public Category add(Category category) {
        category.setId(0);
        return this.repository.save(category);
    }

    @Override
    public Category update(Category category) {
        return this.repository.save(category);
    }

    @Override
    public void deleteById(int id) {
        this.repository.deleteById(id);
    }

}
