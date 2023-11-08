package com.smy.ecommerce.service.abstracts;

import java.util.List;

import com.smy.ecommerce.service.dtos.requests.post.PostCategoryRequest;
import com.smy.ecommerce.service.dtos.requests.put.PutCategoryRequest;
import com.smy.ecommerce.service.dtos.responses.get.GetCategoryResponse;
import com.smy.ecommerce.service.dtos.responses.getAll.GetAllCategoryResponse;
import com.smy.ecommerce.service.dtos.responses.post.PostCategoryResponse;
import com.smy.ecommerce.service.dtos.responses.put.PutCategoryResponse;
import com.smy.ecommerce.utils.results.DataResult;
import com.smy.ecommerce.utils.results.Result;

public interface CategoryService {
    DataResult<List<GetAllCategoryResponse>> getAll();

    DataResult<GetCategoryResponse> getById(int id);

    DataResult<PostCategoryResponse> add(PostCategoryRequest request);

    DataResult<PutCategoryResponse> update(PutCategoryRequest request);

    Result deleteById(int id);
}
