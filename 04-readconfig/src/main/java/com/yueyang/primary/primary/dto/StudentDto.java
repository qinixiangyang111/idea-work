package com.yueyang.primary.primary.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @program: 01-primary
 * @description:
 * @author: qinxiangyang
 * @create: 2020-04-04 22:41
 **/
@Data
@Component
@PropertySource("classpath:custom.properties")
@ConfigurationProperties("student")
public class StudentDto {

    private String name;
    private int age;
    private double score;
}