package com.example.microserviceclouddept8001.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangshiyuan
 * @Date 2020/2/28 17:12
 * 自定义切换规则
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule iRule(){
        //Ribbon默认是轮询，我自定义为随机
        return new RandomRule();
    }
}
