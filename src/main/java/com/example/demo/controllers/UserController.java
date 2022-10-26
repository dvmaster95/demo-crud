package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    private final UserRepository userRepository;

    private UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public Iterable<User> allUsers(){
        return this.userRepository.findAll();
    }

    @PostMapping("/users")
    public User newUser(@RequestBody User incomingUser){
        return this.userRepository.save(incomingUser);
    }
}
