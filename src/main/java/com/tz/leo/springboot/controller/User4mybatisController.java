package com.tz.leo.springboot.controller;

import com.tz.leo.springboot.entity.User4mybatis;
import com.tz.leo.springboot.services.User4mybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/7/12 14:41
 * Content:
 */
@Controller
@RequestMapping("user4mybatis")
public class User4mybatisController {

    @Autowired
    private User4mybatisService user4mybatisService;


    @RequestMapping("showAll")
    public String findAll(Model model) {
        List<User4mybatis> users = user4mybatisService.findAll();
        //System.out.println("hot release in showAll");
        model.addAttribute("users",users);
        return "showAll";
    }


    @RequestMapping("save")
    public String save(User4mybatis user4mybatis){
        user4mybatisService.save(user4mybatis);
        return "redirect:/user4mybatis/showAll";
    }


}
