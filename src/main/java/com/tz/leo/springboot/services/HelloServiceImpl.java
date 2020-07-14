package com.tz.leo.springboot.services;

import org.springframework.stereotype.Service;

/**
 * Author: tz_wl
 * Date: 2020/7/11 18:15
 * Content:
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public void Hello(String name) {
        System.out.println("hello my name is :"+name);
    }
}
