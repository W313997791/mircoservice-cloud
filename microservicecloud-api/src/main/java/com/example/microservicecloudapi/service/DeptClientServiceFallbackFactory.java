package com.example.microservicecloudapi.service;

import com.example.microservicecloudapi.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhangshiyuan
 * @Date 2020/3/2 15:51
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>
{
    @Override
    public DeptClientService create(Throwable cause) {
        return new DeptClientService() {
            @Override
            public List<User> query(User user) {
                return null;
            }

            @Override
            public User getUser(Integer id) {
                return new User().setId(id).setName("服务降级机制").setSchool("springcloud全家桶").setAddress("zsy本地电脑");
            }
        };
    }
}
