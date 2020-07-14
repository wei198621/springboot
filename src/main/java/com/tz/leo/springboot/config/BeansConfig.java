package com.tz.leo.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;

/**
 * Author: tz_wl
 * Date: 2020/7/11 18:22
 * Content:
 */
@Configuration

public class BeansConfig {

    @Bean
    public Calendar getCalendar(){
        System.out.println("BeansConfig");
        return Calendar.getInstance();
    }

    @Bean
    @Scope("prototype")
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");  //加载驱动
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm", "root", "123456");
        return con;
    }
}
