package com.santiago.ecommerce.BackendEcommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemCartController {
    @PostMapping("/add")
    public ResponseEntity<?>agregarProducto(@RequestParam Long usuarioId,@RequestParam Long productoId,@RequestParam int cantidad){
        return ResponseEntity.ok("");
    }


}
