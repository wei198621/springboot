package com.tz.leo.springboot.controller;

import com.tz.leo.springboot.entity.User;
import com.tz.leo.springboot.entity.User02;
import com.tz.leo.springboot.entity.User03;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: tz_wl
 * Date: 2020/7/11 21:05
 * Content:
 */
@RequestMapping("hello05")
@RestController
public class Hello05Controller {

    @Autowired
    User user;
    @Autowired
    User02 user02;

    @Autowired
    User03 user03;

    /**
     *
     * http://localhost:8085/sb/hello04/hello01
     */

    @RequestMapping("hello01")
    public String  hello01(){
        System.out.println("hello05  hello01 ");
        System.out.println(user);
        System.out.println(user02);

        System.out.println(user03);
        System.out.println("打印user03 maps ");
        user03.getMaps().forEach((k,v)-> System.out.println("key is : "+ k+"value is :"+ v ));
        return "给类实例注入application.yml  中的值，" +
                "user 是一个一个注入   " +
                "user02 是@ConfigurationProperties(prefix = \"user\")批量注入" +
                " ";
    }
}
