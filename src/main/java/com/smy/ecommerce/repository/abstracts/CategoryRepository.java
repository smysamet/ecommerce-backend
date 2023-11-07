package com.smy.ecommerce.repository.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smy.ecommerce.entities.concretes.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
