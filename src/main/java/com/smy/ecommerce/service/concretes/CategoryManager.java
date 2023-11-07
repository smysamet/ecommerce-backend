package com.smy.ecommerce.service.concretes;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.smy.ecommerce.entities.concretes.Category;
import com.smy.ecommerce.repository.abstracts.CategoryRepository;
import com.smy.ecommerce.service.abstracts.CategoryService;
import com.smy.ecommerce.service.dtos.requests.post.PostCategoryRequest;
import com.smy.ecommerce.service.dtos.requests.put.PutCategoryRequest;
import com.smy.ecommerce.service.dtos.responses.get.GetCategoryResponse;
import com.smy.ecommerce.service.dtos.responses.getAll.GetAllCategoryResponse;
import com.smy.ecommerce.service.dtos.responses.post.PostCategoryResponse;
import com.smy.ecommerce.service.dtos.responses.put.PutCategoryResponse;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {

    private CategoryRepository repository;
    private ModelMapper modelMapper;

    @Override
    public List<GetAllCategoryResponse> getAll() {
        List<Category> categories = this.repository.findAll();
        List<GetAllCategoryResponse> response = categories
                .stream()
                .map((category) -> {
                    return this.modelMapper.map(category, GetAllCategoryResponse.class);
                })
                .toList();
        return response;
    }

    @Override
    public GetCategoryResponse getById(int id) {
        Category category = this.repository.findById(id).get();
        GetCategoryResponse response = this.modelMapper.map(category, GetCategoryResponse.class);
        return response;
    }

    @Override
    public PostCategoryResponse add(PostCategoryRequest request) {
        Category category = this.modelMapper.map(request, Category.class);
        category.setId(0);
        category = this.repository.save(category);
        PostCategoryResponse response = this.modelMapper.map(category, PostCategoryResponse.class);
        return response;
    }

    @Override
    public PutCategoryResponse update(PutCategoryRequest request) {
        Category category = this.modelMapper.map(request, Category.class);
        category = this.repository.save(category);
        PutCategoryResponse response = this.modelMapper.map(category, PutCategoryResponse.class);
        return response;
    }

    @Override
    public void deleteById(int id) {
        this.repository.deleteById(id);
    }

}
