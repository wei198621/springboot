package com.tz.leo.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Author: tz_wl
 * Date: 2020/7/11 13:16
 * Content:
 *
 * MapperScan             扫描dao接口所在的包
 *
 * ComponentScan
 * EnableAutoConfiguration
 * SpringBootConfiguration
 */
@SpringBootApplication
@MapperScan("com.tz.leo.springboot.dao")
public class Application {
    public static void main(String[] args) {
        System.out.println(args);
        SpringApplication.run(Application.class,args);

       /* LocalDateTime now= LocalDateTime.now();
        System.out.println("开始时间是："+ now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        for (int i=0; i< 10000000 ; i++){
            System.out.println("循环了第"+ (i+1));
        }
        LocalDateTime  end=LocalDateTime.now();
        System.out.println("结束时间是："+ end.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        Duration duration = Duration.between(now,end);
        long minutes = duration.toMinutes();//相差的分钟数
        long millis = duration.toMillis();//相差毫秒数
        long nanos = duration.toNanos();//相差的纳秒数
        System.out.println("************************************");
       // System.out.println("相差的分钟数"+ minutes);
        System.out.println("相差毫秒数"+ millis);
       // System.out.println("相差的纳秒数"+ nanos);*/


    }

}
