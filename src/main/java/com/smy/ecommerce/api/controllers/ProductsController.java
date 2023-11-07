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

import com.smy.ecommerce.entities.concretes.Product;
import com.smy.ecommerce.service.abstracts.ProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductsController {
    private ProductService service;

    @GetMapping
    public List<Product> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable int id) {
        return this.service.getById(id);
    }

    @PostMapping
    public Product add(@RequestBody Product product) {
        return this.service.add(product);
    }

    @PutMapping
    public Product update(@RequestBody Product product) {
        return this.service.update(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        this.service.deleteById(id);
    }
}
