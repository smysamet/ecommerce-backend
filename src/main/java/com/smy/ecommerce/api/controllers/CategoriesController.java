package com.smy.ecommerce.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smy.ecommerce.entities.concretes.Category;
import com.smy.ecommerce.service.abstracts.CategoryService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoriesController {
    private CategoryService service;

    @GetMapping
    public List<Category> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public Category getById(@PathVariable int id) {
        return this.service.getById(id);
    }

    @PostMapping
    public Category add(@RequestBody Category category) {
        return this.service.add(category);
    }

    @PutMapping
    public Category update(@RequestBody Category category) {
        return this.service.update(category);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        this.service.deleteById(id);
    }

}
