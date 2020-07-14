package com.tz.leo.springboot.services;

import com.tz.leo.springboot.entity.User4mybatis;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/7/12 13:36
 * Content:
 */
public interface User4mybatisService {
    void save(User4mybatis user4mybatis);
    List<User4mybatis> findAll();
}
