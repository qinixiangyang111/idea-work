package com.yueyang.primary.primary.controller;

import com.yueyang.primary.primary.dto.CountryDto;
import com.yueyang.primary.primary.dto.GroupUsersDto;
import com.yueyang.primary.primary.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: idea-work
 * @description: 你好世界控制器
 * @author: qinxiangyang
 * @create: 2020-04-04 19:45
 **/
@RestController
public class HelloController {

    @Autowired
    private StudentDto studentDto;

    @Autowired
    private CountryDto countryDto;

    @Autowired
    private GroupUsersDto groupUsersDto;

    @RequestMapping("/send")
    private String send() {

        return studentDto.getName() + ": " + studentDto.getAge();
    }

    @RequestMapping("/country")
    private String country() {

        return countryDto.toString();
    }

    @RequestMapping("/group")
    private String group() {

        return groupUsersDto.toString();
    }

    @RequestMapping("/hello")
    public String someHandel() {
        return "hello sadsa dsadsad 121212  world";
    }
}