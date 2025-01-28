package com.santiago.ecommerce.BackendEcommerce.repositories;

import com.santiago.ecommerce.BackendEcommerce.entities.ItemCart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ItemCartRepository extends CrudRepository<ItemCart, Long> {


}
