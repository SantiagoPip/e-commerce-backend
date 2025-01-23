package com.santiago.ecommerce.BackendEcommerce.repositories;

import com.santiago.ecommerce.BackendEcommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
