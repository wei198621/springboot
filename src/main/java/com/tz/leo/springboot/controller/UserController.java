package com.tz.leo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: tz_wl
 * Date: 2020/7/12 9:10
 * Content:
 */
@RequestMapping("user")
@Controller
public class UserController {

    @RequestMapping("findAll")
    public String findAll(){
        System.out.println("find All in user");
        return "index";
    }

}
