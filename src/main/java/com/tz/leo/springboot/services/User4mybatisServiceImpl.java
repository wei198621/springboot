package com.tz.leo.springboot.services;

import cn.hutool.Hutool;
import cn.hutool.core.util.RandomUtil;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.tz.leo.springboot.dao.User4mybatisDao;
import com.tz.leo.springboot.entity.User4mybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/7/12 13:38
 * Content:
 */
@Service
@Transactional
public class User4mybatisServiceImpl implements User4mybatisService {

    @Autowired
    User4mybatisDao user4mybatisDao;

    @Override
    public void save(User4mybatis user4mybatis) {

       int rInt=  RandomUtil.randomInt(100,10000);

        user4mybatis.setId(rInt);
        user4mybatisDao.save(user4mybatis);

       // int i= 1/0;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User4mybatis> findAll() {
        return user4mybatisDao.findAll();
    }
}
