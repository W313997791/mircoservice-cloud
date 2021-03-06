package com.example.microservicecloudconfigdeptclient8001.mapper;

import com.example.microservicecloudapi.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {
    Integer add(User user);
    Integer delete(User user);
    List<User> query(User user);
    User getUser(Integer id);
}
