package com.smy.ecommerce.service.abstracts;

import java.util.List;

import com.smy.ecommerce.entities.concretes.Product;

public interface ProductService {
    List<Product> getAll();

    Product getById(int id);

    Product add(Product product);

    Product update(Product product);

    void deleteById(int id);
}
