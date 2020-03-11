package com.example.microservicecloudconfigclient3355.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangshiyuan
 * @Date 2020/3/4 8:59
 */
@RestController
public class ConfigClientRest {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig()
    {
        String str = "applicationName: "+applicationName+"\n eurekaServers:"+eurekaServers+"\n port: "+port;
        System.out.println("******str: "+ str);
        return "applicationName: "+applicationName+"\n eurekaServers:"+eurekaServers+"\n port: "+port;
    }

}
