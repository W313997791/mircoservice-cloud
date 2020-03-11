package com.example.microservicecloudapi.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author zhangshiyuan
 * @Date 2020/2/28 15:56
 */
@Data
@Accessors(chain = true)
public class User {

    private int id;

    private String name;

    private String school;

    private String address;
}
