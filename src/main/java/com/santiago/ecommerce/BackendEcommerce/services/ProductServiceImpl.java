package com.santiago.ecommerce.BackendEcommerce.services;

import com.santiago.ecommerce.BackendEcommerce.entities.Product;
import com.santiago.ecommerce.BackendEcommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Product> deleteProductById(Long id) {

        //Optional<Product> product = productRepository.findById();


        return Optional.empty();
    }

    @Override
    public Optional<Product> updateProduct(Long id) {
        return Optional.empty();
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
