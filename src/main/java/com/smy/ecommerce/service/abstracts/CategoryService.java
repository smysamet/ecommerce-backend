package com.smy.ecommerce.service.abstracts;

import java.util.List;

import com.smy.ecommerce.service.dtos.requests.post.PostCategoryRequest;
import com.smy.ecommerce.service.dtos.requests.put.PutCategoryRequest;
import com.smy.ecommerce.service.dtos.responses.get.GetCategoryResponse;
import com.smy.ecommerce.service.dtos.responses.getAll.GetAllCategoryResponse;
import com.smy.ecommerce.service.dtos.responses.post.PostCategoryResponse;
import com.smy.ecommerce.service.dtos.responses.put.PutCategoryResponse;

public interface CategoryService {
    List<GetAllCategoryResponse> getAll();

    GetCategoryResponse getById(int id);

    PostCategoryResponse add(PostCategoryRequest request);

    PutCategoryResponse update(PutCategoryRequest request);

    void deleteById(int id);
}
