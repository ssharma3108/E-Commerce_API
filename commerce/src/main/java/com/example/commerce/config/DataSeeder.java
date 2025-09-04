package com.example.commerce.config;

import com.example.commerce.model.Category;
import com.example.commerce.model.Product;
import com.example.commerce.repository.CategoryRepository;
import com.example.commerce.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) {
        // clear data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        // categories
        Category electronics = new Category();
        electronics.setName("Electronics");
        Category clothing = new Category();
        clothing.setName("Clothing");
        Category home = new Category();
        home.setName("Home");

        categoryRepository.save(electronics);
        categoryRepository.save(clothing);
        categoryRepository.save(home);

        // products
        Product phone = new Product();
        phone.setName("Phone");
        phone.setImage("https://placehold.co/600x400");
        phone.setCategory(electronics);
        phone.setDescription("Phone description");
        phone.setPrice(10000);
        productRepository.save(phone);

        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setImage("https://placehold.co/600x400");
        laptop.setCategory(electronics);
        laptop.setDescription("Laptop description");
        laptop.setPrice(50000);
        productRepository.save(laptop);

        Product jacket = new Product();
        jacket.setName("Jacket");
        jacket.setImage("https://placehold.co/600x400");
        jacket.setCategory(clothing);
        jacket.setDescription("Jacket description");
        jacket.setPrice(500);
        productRepository.save(jacket);
    }
}
