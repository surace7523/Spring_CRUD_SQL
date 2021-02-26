package com.springbootproj1.springbootcrud.repository;

import com.springbootproj1.springbootcrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
