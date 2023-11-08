package com.smy.ecommerce.service.concretes;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.smy.ecommerce.entities.concretes.Product;
import com.smy.ecommerce.repository.abstracts.ProductRepository;
import com.smy.ecommerce.service.abstracts.ProductService;
import com.smy.ecommerce.service.dtos.requests.post.PostProductRequest;
import com.smy.ecommerce.service.dtos.requests.put.PutProductRequest;
import com.smy.ecommerce.service.dtos.responses.get.GetProductResponse;
import com.smy.ecommerce.service.dtos.responses.getAll.GetAllProductResponse;
import com.smy.ecommerce.service.dtos.responses.post.PostProductResponse;
import com.smy.ecommerce.service.dtos.responses.put.PutProductResponse;
import com.smy.ecommerce.utils.results.DataResult;
import com.smy.ecommerce.utils.results.Result;
import com.smy.ecommerce.utils.results.SuccessDataResult;
import com.smy.ecommerce.utils.results.SuccessResult;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

    private ProductRepository repository;
    private ModelMapper modelMapper;

    @Override
    public DataResult<List<GetAllProductResponse>> getAll() {
        List<Product> products = this.repository.findAll();
        List<GetAllProductResponse> response = products
                .stream()
                .map((product) -> {
                    return this.modelMapper.map(product, GetAllProductResponse.class);
                })
                .toList();

        SuccessDataResult<List<GetAllProductResponse>> result = new SuccessDataResult<List<GetAllProductResponse>>(
                response, "Products found!");
        return result;
    }

    @Override
    public DataResult<GetProductResponse> getById(int id) {
        Product product = this.repository.findById(id).get();
        GetProductResponse response = this.modelMapper.map(product, GetProductResponse.class);
        SuccessDataResult<GetProductResponse> result = new SuccessDataResult<GetProductResponse>(response,
                "Product found!");
        return result;
    }

    @Override
    public DataResult<PostProductResponse> add(PostProductRequest request) {
        Product product = this.modelMapper.map(request, Product.class);
        product.setId(0);
        product = this.repository.save(product);
        PostProductResponse response = this.modelMapper.map(product, PostProductResponse.class);
        SuccessDataResult<PostProductResponse> result = new SuccessDataResult<PostProductResponse>(response,
                "Product added!");
        return result;
    }

    @Override
    public DataResult<PutProductResponse> update(PutProductRequest request) {
        Product product = this.modelMapper.map(request, Product.class);
        product = this.repository.save(product);
        PutProductResponse response = this.modelMapper.map(product, PutProductResponse.class);
        SuccessDataResult<PutProductResponse> result = new SuccessDataResult<PutProductResponse>(response,
                "Product updated!");
        return result;
    }

    @Override
    public Result deleteById(int id) {
        this.repository.deleteById(id);
        SuccessResult result = new SuccessResult("Product deleted!");
        return result;
    }

}
