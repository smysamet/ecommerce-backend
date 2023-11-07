package com.smy.ecommerce.repository.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smy.ecommerce.entities.concretes.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
