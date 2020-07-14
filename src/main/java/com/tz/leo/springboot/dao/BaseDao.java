package com.tz.leo.springboot.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/7/12 13:19
 * Content:
 */
public interface BaseDao<T> {

    void update(T t);
    void save(T t);
    void delete(Integer id);
    Long findAllCount();
    T findById(Integer id);
    List<T> findAll();
    List<T> findByPage(@Param("start") Integer start, @Param("size") Integer size);

}

