package com.santiago.ecommerce.BackendEcommerce.controller;

import com.santiago.ecommerce.BackendEcommerce.repositories.CartRepository;
import com.santiago.ecommerce.BackendEcommerce.services.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @Autowired
    private CartServiceImpl cartRepository;




}
