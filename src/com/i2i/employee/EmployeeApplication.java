package com.i2i.employee;


import com.i2i.employee.model.Users;
import com.i2i.employee.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@SpringBootApplication
public class EmployeeApplication {
    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void initUsers() {
        List<Users> user = Stream.of(
                new Users(101, "siva", "password", "siva@gmail.com"),
                new Users(102, "user1", "pwd1", "user1@gmail.com"),
                new Users(103, "user2", "pwd2", "user2@gmail.com"),
                new Users(104, "user3", "pwd3", "user3@gmail.com")
        ).collect(Collectors.toList());
        userRepository.saveAll(user);

    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }


}
