package com.santiago.ecommerce.BackendEcommerce.services;

import com.santiago.ecommerce.BackendEcommerce.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> deleteUserById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> updateUser(Long id) {
        return Optional.empty();
    }

    @Override
    public User createUser(User user) {
        return null;
    }
}
