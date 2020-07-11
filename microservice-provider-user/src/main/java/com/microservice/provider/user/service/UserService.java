package com.microservice.provider.user.service;

import com.microservice.provider.user.dao.UserRepository;
import com.microservice.provider.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User findById(int id){
        return repository.findById(id);
    }
}
