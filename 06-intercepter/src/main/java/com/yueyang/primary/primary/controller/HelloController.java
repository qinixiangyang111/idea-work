package com.yueyang.primary.primary.controller;

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


    @RequestMapping("/hello")
    public String someHandel() {
        return "hello sadsa dsadsad 121212  world";
    }

    @RequestMapping("/first/some")
    public String first() {
        return "first";
    }

    @RequestMapping("/second/orther")
    public String second() {
        return "second";
    }
}