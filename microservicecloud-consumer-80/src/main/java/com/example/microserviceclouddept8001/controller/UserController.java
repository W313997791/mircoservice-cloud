package com.example.microserviceclouddept8001.controller;

import com.example.microservicecloudapi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class UserController {

    //单机测试微服务连接
    //private final String  REST_URL_PREFIX = "http://localhost:8001";

    //ribbon负载均衡
    //Ribbon和Eureka整合后Consumer可以直接调用服务而不用再关心地址和端口号
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/list")
    public List<User> query(User user){
        List<User>  list = restTemplate.getForObject(REST_URL_PREFIX+"/list",List.class,user);
        return list;
    }

    @RequestMapping(value="/discovery")
    public Object discovery()
    {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery", Object.class);
    }

    @GetMapping("/get")
    public User getUser(Integer id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/get?id="+id,User.class);
    }
}
