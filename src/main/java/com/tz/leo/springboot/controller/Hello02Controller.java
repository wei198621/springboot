package com.tz.leo.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: tz_wl
 * Date: 2020/7/11 15:12
 * Content:
 * RestController  等于： @Controller + @ResponseBody
 * 在类上面指定了@ResponseBody (return json 序列号)
 * 方法上面就不用一一指定了
 */
@RequestMapping("hello02")
@RestController
public class Hello02Controller {

    /**
     *  http://localhost:8085/sb/hello02/hello01
     * @return
     */
    @RequestMapping("hello01")
    public String hello01(){
        System.out.println("hello02  hello01 ");
        return "hello02  01  ";
    }
}
