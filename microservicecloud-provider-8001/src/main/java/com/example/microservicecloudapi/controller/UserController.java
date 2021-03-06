package com.example.microservicecloudapi.controller;

import com.example.microservicecloudapi.entity.User;
import com.example.microservicecloudapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/list")
    public List<User> query(User user){
        return userService.query(user);
    }

    @GetMapping("/dept/discovery")
    public Object getDiscovery(){
        List<String> list = client.getServices();
        System.out.println("**********"+list);
        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }

    @RequestMapping("/get")
    public User getUser(@RequestParam("id") Integer id){
        User user = userService.getUser(id);
        if (null == user){
            throw new RuntimeException("查无此人！！！");
        }
        return user;
    }
}
