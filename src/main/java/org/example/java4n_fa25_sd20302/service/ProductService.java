package org.example.java4n_fa25_sd20302.service;

import org.example.java4n_fa25_sd20302.entity.Product;
import org.example.java4n_fa25_sd20302.repository.ProductRepository;

import java.util.List;

public class ProductService {

    private ProductRepository productRepository = new ProductRepository();

    public List<Product> getProducts() {

        return productRepository.getProducts();
    }
}
