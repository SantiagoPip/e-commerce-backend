package com.santiago.ecommerce.BackendEcommerce.services;

import com.santiago.ecommerce.BackendEcommerce.entities.Product;
import com.santiago.ecommerce.BackendEcommerce.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product>getAllProducts();
    Optional<Product> getProductById(Long  id);
    Optional<Product> deleteProductById(Long id);
    Optional<Product>updateProduct(Long id);
    Product createProduct(Product product);
}
