package com.santiago.ecommerce.BackendEcommerce.services;

import com.santiago.ecommerce.BackendEcommerce.entities.Product;
import com.santiago.ecommerce.BackendEcommerce.entities.User;
import com.santiago.ecommerce.BackendEcommerce.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

public interface IUserService  {
    List<User> getAllUsers();
    Optional<User> getUserById(Long  id);
    Optional<User> deleteUserById(Long id);
    Optional<User>updateUser(Long id);
    User createUser(User user);
}
