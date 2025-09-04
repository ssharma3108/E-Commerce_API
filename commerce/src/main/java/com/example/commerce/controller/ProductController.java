package com.example.commerce.controller;

import com.example.commerce.model.Product;
import com.example.commerce.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // GET /api/products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // GET /api/products/category/{id}
    @GetMapping("/category/{id}")
    public List<Product> getProductsByCategory(@PathVariable int id) {
        return productService.getProductsByCategory(id);
    }
}
