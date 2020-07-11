package com.microservice.provider.user.controller;

import com.microservice.provider.user.entity.User;
import com.microservice.provider.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/provider/{id}")
    public User findById(@PathVariable int id){
        User findOne =service.findById(id);
        return findOne;
    }
}
