package com.santiago.ecommerce.BackendEcommerce.services;

import com.santiago.ecommerce.BackendEcommerce.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements IProductService {

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Product> deleteProductById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Product> updateProduct(Long id) {
        return Optional.empty();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }
}
