package com.example.microservicecloudapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@MapperScan(basePackages = {"com.example.microservicecloudapi.mapper"})
@EnableEurekaClient
@EnableDiscoveryClient
public class MicroservicecloudProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProvider8001Application.class, args);
    }

}
