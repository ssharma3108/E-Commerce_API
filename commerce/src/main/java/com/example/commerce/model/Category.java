package com.example.commerce.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private Set<Product> products;


}
