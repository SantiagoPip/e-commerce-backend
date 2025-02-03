package com.santiago.ecommerce.BackendEcommerce.controller;

import com.santiago.ecommerce.BackendEcommerce.entities.Cart;
import com.santiago.ecommerce.BackendEcommerce.entities.ItemCart;
import com.santiago.ecommerce.BackendEcommerce.entities.User;
import com.santiago.ecommerce.BackendEcommerce.repositories.CartRepository;
import com.santiago.ecommerce.BackendEcommerce.services.CartServiceImpl;
import com.santiago.ecommerce.BackendEcommerce.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/cart")
public class CartController {
    @Autowired
    private CartServiceImpl cartRepository;
    @Autowired
    private UserServiceImpl userService;
    @PostMapping("/id")
    private ResponseEntity<?>addItemCart(@RequestBody ItemCart cart, @PathVariable Long id) {
        ItemCart item = new ItemCart();
        item.setProduct(cart.getProduct());
        item.setQuantity(cart.getQuantity());
        User user = userService.getUserById(id);
        user.addItems(item);


    }




}
