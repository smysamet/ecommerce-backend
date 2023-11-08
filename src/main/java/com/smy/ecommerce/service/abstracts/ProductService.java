package com.smy.ecommerce.service.abstracts;

import java.util.List;

import com.smy.ecommerce.service.dtos.requests.post.PostProductRequest;
import com.smy.ecommerce.service.dtos.requests.put.PutProductRequest;
import com.smy.ecommerce.service.dtos.responses.get.GetProductResponse;
import com.smy.ecommerce.service.dtos.responses.getAll.GetAllProductResponse;
import com.smy.ecommerce.service.dtos.responses.post.PostProductResponse;
import com.smy.ecommerce.service.dtos.responses.put.PutProductResponse;
import com.smy.ecommerce.utils.results.DataResult;
import com.smy.ecommerce.utils.results.Result;

public interface ProductService {
    DataResult<List<GetAllProductResponse>> getAll();

    DataResult<GetProductResponse> getById(int id);

    DataResult<PostProductResponse> add(PostProductRequest product);

    DataResult<PutProductResponse> update(PutProductRequest product);

    Result deleteById(int id);
}
