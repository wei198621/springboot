package com.tz.leo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: tz_wl
 * Date: 2020/7/11 13:06
 * Content:
 */
@RequestMapping("hello01")
@Controller                    //@RestController
public class Hello01Controller {

    /**
     * 路径  http://localhost:8086/sb/hello01/hello01
     * 没有@ResponseBody 注释 表示转到hello01.jsp这个页面
     * @return
     */
    @RequestMapping("hello01")
    public String Hello01(){
        System.out.println("hello  01 ");
        return "hello01";
    }

    /**
     * http://localhost:8086/sb/hello01/hello02
    @ResponseBody  将结果转换为Json格式返回前台

     */
    @RequestMapping("hello02")
    @ResponseBody
    public String Hello02(){
        System.out.println("hello  02 ");
        return "hello 02";
    }

}
