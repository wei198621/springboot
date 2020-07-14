package com.tz.leo.springboot.aspect;

import cn.hutool.core.date.DateTime;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Author: tz_wl
 * Date: 2020/7/12 19:18
 * Content:
 */
@Component
@Aspect
public class AspectTest {

    @Before(value = "within(com.tz.leo.springboot.services.*Impl)")
    public void beforeTest(){
        System.out.println("***************"+ DateTime.now().toTimeStr()+" ; 这个是面向切面编程before方法打印内容*************");
    }
}
