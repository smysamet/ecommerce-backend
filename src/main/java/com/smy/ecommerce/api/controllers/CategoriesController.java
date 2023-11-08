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

import com.smy.ecommerce.service.abstracts.CategoryService;
import com.smy.ecommerce.service.dtos.requests.post.PostCategoryRequest;
import com.smy.ecommerce.service.dtos.requests.put.PutCategoryRequest;
import com.smy.ecommerce.service.dtos.responses.get.GetCategoryResponse;
import com.smy.ecommerce.service.dtos.responses.getAll.GetAllCategoryResponse;
import com.smy.ecommerce.service.dtos.responses.post.PostCategoryResponse;
import com.smy.ecommerce.service.dtos.responses.put.PutCategoryResponse;
import com.smy.ecommerce.utils.results.DataResult;
import com.smy.ecommerce.utils.results.Result;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoriesController {
    private CategoryService service;

    @GetMapping
    public DataResult<List<GetAllCategoryResponse>> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public DataResult<GetCategoryResponse> getById(@PathVariable int id) {
        return this.service.getById(id);
    }

    @PostMapping
    public DataResult<PostCategoryResponse> add(@RequestBody PostCategoryRequest request) {
        return this.service.add(request);
    }

    @PutMapping
    public DataResult<PutCategoryResponse> update(@RequestBody PutCategoryRequest request) {
        return this.service.update(request);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable int id) {
        return this.service.deleteById(id);
    }

}
