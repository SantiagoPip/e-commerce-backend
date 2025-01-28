package com.santiago.ecommerce.BackendEcommerce.repositories;

import com.santiago.ecommerce.BackendEcommerce.entities.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {
}
