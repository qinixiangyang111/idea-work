package com.yueyang.primary.primary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@ServletComponentScan("com.yueyang.primary.primary.servlet")//开启Servlet扫描
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }




}
