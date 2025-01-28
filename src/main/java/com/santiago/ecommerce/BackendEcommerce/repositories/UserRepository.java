package com.santiago.ecommerce.BackendEcommerce.repositories;

import com.santiago.ecommerce.BackendEcommerce.entities.User;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
