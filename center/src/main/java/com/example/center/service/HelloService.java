package com.example.center.service;

import com.example.center.entity.Hello;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String sayHello() {
        return new Hello(1, "张三").toString();
    }
}
