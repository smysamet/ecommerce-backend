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

import com.smy.ecommerce.service.abstracts.ProductService;
import com.smy.ecommerce.service.dtos.requests.post.PostProductRequest;
import com.smy.ecommerce.service.dtos.requests.put.PutProductRequest;
import com.smy.ecommerce.service.dtos.responses.get.GetProductResponse;
import com.smy.ecommerce.service.dtos.responses.getAll.GetAllProductResponse;
import com.smy.ecommerce.service.dtos.responses.post.PostProductResponse;
import com.smy.ecommerce.service.dtos.responses.put.PutProductResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductsController {
    private ProductService service;

    @GetMapping
    public List<GetAllProductResponse> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public GetProductResponse getById(@PathVariable int id) {
        return this.service.getById(id);
    }

    @PostMapping
    public PostProductResponse add(@RequestBody PostProductRequest request) {
        return this.service.add(request);
    }

    @PutMapping
    public PutProductResponse update(@RequestBody PutProductRequest request) {
        return this.service.update(request);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        this.service.deleteById(id);
    }
}
