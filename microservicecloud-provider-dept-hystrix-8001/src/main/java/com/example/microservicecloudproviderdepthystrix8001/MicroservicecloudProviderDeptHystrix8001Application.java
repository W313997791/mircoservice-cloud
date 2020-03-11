package com.example.microservicecloudproviderdepthystrix8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.microservicecloudproviderdepthystrix8001.mapper"})
@EnableEurekaClient
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class MicroservicecloudProviderDeptHystrix8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderDeptHystrix8001Application.class, args);
    }

}
