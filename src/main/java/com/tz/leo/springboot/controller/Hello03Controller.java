package com.tz.leo.springboot.controller;

import com.tz.leo.springboot.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;

/**
 * Author: tz_wl
 * Date: 2020/7/11 18:16
 * Content:
 */
@RequestMapping("hello03")
@RestController
public class Hello03Controller {

    //引入自定义类
    @Autowired
    HelloService helloService;


    //BeansConfig
    //引入日历类
    @Autowired
    Calendar calendar;

    //引入连接类
    @Autowired
    Connection connection;


    @Autowired
    Connection connection2;


    /**
     * http://localhost:8085/sb/hello03/hello01
     * @throws SQLException
     */
    @RequestMapping("hello01")
    public String HelloService01() throws SQLException {
        helloService.Hello("老李");
        System.out.println( calendar.getTime());
        System.out.println(connection);
        System.out.println(connection2);
        System.out.println("finish");

        return "ok in hello0301 ";
    }

}
