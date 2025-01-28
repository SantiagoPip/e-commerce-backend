package com.santiago.ecommerce.BackendEcommerce.services;

import com.santiago.ecommerce.BackendEcommerce.entities.User;
import com.santiago.ecommerce.BackendEcommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    @Override
    public User deleteUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        user.ifPresent(value -> userRepository.delete(value));
        return user.orElseThrow(() -> new RuntimeException("User not found with id: " + id));

    }

    @Override
    public User updateUser(User user, Long id) {
        return userRepository.findById(id).map(updatedUser->{
            updatedUser.setEmail(user.getEmail());
            updatedUser.setPassword(user.getPassword());
            updatedUser.setUsername(user.getUsername());
            return userRepository.save(updatedUser);

        }).orElseThrow(()-> new RuntimeException("User not found with id: " + id));
    }


    @Override
    public User createUser(User user) {
        return null;
    }
}
