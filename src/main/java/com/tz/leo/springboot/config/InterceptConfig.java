package com.tz.leo.springboot.config;

import com.tz.leo.springboot.interceptors.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Author: tz_wl
 * Date: 2020/7/14 20:21
 * Content:
 */
@Component
public class InterceptConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private MyInterceptor myInterceptor;


    /**
    *@Description: InterceptorRegistry  注册拦截器  配置其拦截哪个 不拦截哪个
    *@Param: 
    *@return:
    *@date: 2020/7/14
    */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor)
                .addPathPatterns("/file/**")             //controller 下file路径下的 所有操作要执行 此拦截
                .excludePathPatterns("/file/upload")     //                 除了upload方法以外
                ;
    }
}
