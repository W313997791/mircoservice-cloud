package com.example.microservicecloudapi.service;

import com.example.microservicecloudapi.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author zhangshiyuan
 * @Date 2020/3/2 10:13
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping("/list")
    List<User> query(User user);

    @RequestMapping("/get")
    User getUser(@RequestParam("id") Integer id);
}
