package com.santiago.ecommerce.BackendEcommerce.controller;

import com.santiago.ecommerce.BackendEcommerce.entities.User;
import com.santiago.ecommerce.BackendEcommerce.repositories.UserRepository;
import com.santiago.ecommerce.BackendEcommerce.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @GetMapping()
    public ResponseEntity<?>getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@RequestBody User user,@PathVariable Long id) {
        return ResponseEntity.ok(userService.updateUser(user,id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        return ResponseEntity.ok(userService.deleteUserById(id));
    }



}
