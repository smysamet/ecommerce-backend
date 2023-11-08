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

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

    private ProductRepository repository;
    private ModelMapper modelMapper;

    @Override
    public List<GetAllProductResponse> getAll() {
        List<Product> products = this.repository.findAll();
        List<GetAllProductResponse> response = products
                .stream()
                .map((product) -> {
                    return this.modelMapper.map(product, GetAllProductResponse.class);
                })
                .toList();
        return response;
    }

    @Override
    public GetProductResponse getById(int id) {
        Product product = this.repository.findById(id).get();
        GetProductResponse response = this.modelMapper.map(product, GetProductResponse.class);
        return response;
    }

    @Override
    public PostProductResponse add(PostProductRequest request) {
        Product product = this.modelMapper.map(request, Product.class);
        product.setId(0);
        product = this.repository.save(product);
        PostProductResponse response = this.modelMapper.map(product, PostProductResponse.class);
        return response;
    }

    @Override
    public PutProductResponse update(PutProductRequest request) {
        Product product = this.modelMapper.map(request, Product.class);
        product = this.repository.save(product);
        PutProductResponse response = this.modelMapper.map(product, PutProductResponse.class);
        return response;
    }

    @Override
    public void deleteById(int id) {
        this.repository.deleteById(id);
    }

}
