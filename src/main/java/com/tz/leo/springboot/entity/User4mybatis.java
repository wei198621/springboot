package com.tz.leo.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * Author: tz_wl
 * Date: 2020/7/12 13:14
 * Content:
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class User4mybatis {
    private int id;
    private String name;
    private Integer age;
    private Date bir;
}
