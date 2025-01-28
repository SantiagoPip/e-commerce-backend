package com.santiago.ecommerce.BackendEcommerce.services;

import com.santiago.ecommerce.BackendEcommerce.entities.Product;
import com.santiago.ecommerce.BackendEcommerce.entities.User;
import com.santiago.ecommerce.BackendEcommerce.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

public interface IUserService  {
    List<User> getAllUsers();
    User getUserById(Long  id);
    User deleteUserById(Long id);
    User updateUser(User user, Long id);
    User createUser(User user);
}
