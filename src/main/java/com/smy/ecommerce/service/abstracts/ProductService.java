package com.smy.ecommerce.service.abstracts;

import java.util.List;

import com.smy.ecommerce.service.dtos.requests.post.PostProductRequest;
import com.smy.ecommerce.service.dtos.requests.put.PutProductRequest;
import com.smy.ecommerce.service.dtos.responses.get.GetProductResponse;
import com.smy.ecommerce.service.dtos.responses.getAll.GetAllProductResponse;
import com.smy.ecommerce.service.dtos.responses.post.PostProductResponse;
import com.smy.ecommerce.service.dtos.responses.put.PutProductResponse;

public interface ProductService {
    List<GetAllProductResponse> getAll();

    GetProductResponse getById(int id);

    PostProductResponse add(PostProductRequest product);

    PutProductResponse update(PutProductRequest product);

    void deleteById(int id);
}
