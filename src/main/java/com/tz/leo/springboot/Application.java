package com.tz.leo.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: tz_wl
 * Date: 2020/7/11 13:16
 * Content:  正常idea开发用此配置
 * MapperScan             扫描dao接口所在的包 *
 * ComponentScan
 * EnableAutoConfiguration
 * SpringBootConfiguration
 */
@SpringBootApplication
@MapperScan("com.tz.leo.springboot.dao")
public class Application  {
    public static void main(String[] args) {
        System.out.println(args);
        SpringApplication.run(Application.class, args);
    }
}

/*

//如下配置为 war打包配置  ，暂时不用
@SpringBootApplication
@MapperScan("com.tz.leo.springboot.dao")
public class Application extends SpringBootServletInitializer {

    // war 打包步骤之一
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class); //指定入口类类对象即可
    }

    public static void main(String[] args) {
        System.out.println(args);
        SpringApplication.run(Application.class, args);
    }
}
*/
