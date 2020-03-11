package com.example.microservicecloudprovider8002.service.impl;

import com.example.microservicecloudapi.entity.User;
import com.example.microservicecloudprovider8002.mapper.UserMapper;
import com.example.microservicecloudprovider8002.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer add(User user) {
        return userMapper.add(user);
    }

    @Override
    public Integer delete(User user) {
        return userMapper.delete(user);
    }

    @Override
    public List<User> query(User user) {
        return userMapper.query(user);
    }

    @Override
    public User getUser(Integer id) {
        return userMapper.getUser(id);
    }
}
