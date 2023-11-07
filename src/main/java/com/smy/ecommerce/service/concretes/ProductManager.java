package com.smy.ecommerce.service.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smy.ecommerce.entities.concretes.Product;
import com.smy.ecommerce.repository.abstracts.ProductRepository;
import com.smy.ecommerce.service.abstracts.ProductService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

    private ProductRepository repository;

    @Override
    public List<Product> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Product getById(int id) {
        return this.repository.findById(id).get();
    }

    @Override
    public Product add(Product product) {
        product.setId(0);
        return this.repository.save(product);
    }

    @Override
    public Product update(Product product) {
        return this.repository.save(product);
    }

    @Override
    public void deleteById(int id) {
        this.repository.deleteById(id);
    }

}
