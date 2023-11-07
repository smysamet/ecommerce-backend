package com.smy.ecommerce.service.abstracts;

import java.util.List;

import com.smy.ecommerce.entities.concretes.Category;

public interface CategoryService {
    List<Category> getAll();

    Category getById(int id);

    Category add(Category category);

    Category update(Category category);

    void deleteById(int id);
}
