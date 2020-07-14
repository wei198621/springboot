package com.tz.leo.springboot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;

/**
 * Author: tz_wl
 * Date: 2020/7/11 21:01
 * Content:
 *
 * ConfigurationProperties(prefix="user")  这样一来就不用每个属性都写@Value("${}") 进行值注入了
 */
@Component
@ConfigurationProperties(prefix = "user03")
public class User03 {

    private String id;

    private String namea;

    private Integer age;

    private Date bir;

    private Map<String,String> maps;

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public User03() {
    }


    public User03(String id, String namea, Integer age, Date bir, Map<String, String> maps) {
        this.id = id;
        this.namea = namea;
        this.age = age;
        this.bir = bir;
        this.maps = maps;
    }

    public User03(String id, String namea, Integer age, Date bir ) {
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
