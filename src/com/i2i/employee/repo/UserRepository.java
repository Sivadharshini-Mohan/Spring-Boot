package com.i2i.employee.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends JpaRepository<User,Integer> {
        User findByUserName(String username);
    }

