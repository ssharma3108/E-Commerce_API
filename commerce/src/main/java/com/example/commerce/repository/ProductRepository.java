package com.example.commerce.repository;

import com.example.commerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Correct method to get all products by category id
    List<Product> findByCategoryId(int categoryId);
}
