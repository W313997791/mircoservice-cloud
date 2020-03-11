package com.example.microservicecloudprovider8003.service;

import com.example.microservicecloudapi.entity.User;

import java.util.List;

public interface UserService {
    Integer add(User user);
    Integer delete(User user);
    List<User> query(User user);
    User getUser(Integer id);
}
