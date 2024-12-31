package com.example.Spring.Boot;


import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product with ID " + id + " not found"));
    }

    public List<Product> searchByName(String name) {

        return productRepository.findByNameContainingIgnoreCase(name);
    }

    public Product save(Product product) {

        return productRepository.save(product);
    }

    public void deleteById(Long id) {

        productRepository.deleteById(id);
    }
}
