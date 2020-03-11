package com.example.microserviceclouddept8001;

import com.example.microserviceclouddept8001.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration = MyselfRule.class)
public class MicroservicecloudConsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConsumer80Application.class, args);
    }

}
