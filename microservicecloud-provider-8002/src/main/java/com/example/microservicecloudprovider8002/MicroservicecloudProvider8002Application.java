package com.example.microservicecloudprovider8002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.microservicecloudprovider8002.mapper"})
@EnableEurekaClient
@EnableDiscoveryClient
public class MicroservicecloudProvider8002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProvider8002Application.class, args);
    }

}
