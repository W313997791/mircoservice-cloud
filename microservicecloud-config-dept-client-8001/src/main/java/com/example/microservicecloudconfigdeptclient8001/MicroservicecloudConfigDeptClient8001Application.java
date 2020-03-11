package com.example.microservicecloudconfigdeptclient8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.example.microservicecloudconfigdeptclient8001.mapper"})
@EnableDiscoveryClient
public class MicroservicecloudConfigDeptClient8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConfigDeptClient8001Application.class, args);
    }

}
