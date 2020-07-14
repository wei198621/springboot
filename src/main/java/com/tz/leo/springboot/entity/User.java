package com.tz.leo.springboot.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Author: tz_wl
 * Date: 2020/7/11 21:01
 * Content:
 */
@Component
public class User {

    @Value("${user.id}")
    private String id;
    @Value("${user.namea}")
    private String namea;

    @Value("${user.age}")
    private Integer age;

    @Value("${user.bir}")
    private Date bir;

    public User() {
    }

    public User(String id, String namea, Integer age, Date bir) {
        this.id = id;
        this.namea = namea;
        this.age = age;
        this.bir = bir;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", namea='" + namea + '\'' +
                ", age=" + age +
                ", bir=" + bir +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamea() {
        return namea;
    }

    public void setNamea(String namea) {
        this.namea = namea;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }
}
