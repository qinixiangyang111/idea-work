package com.yueyang.primary.primary.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: 01-primary
 * @description:
 * @author: qinxiangyang
 * @create: 2020-04-05 18:34
 **/
@Configuration
public class MyApplicationContext {
    public ServletRegistrationBean<SomeServlet> getBean() {
        SomeServlet someServlet = new SomeServlet();
        return new ServletRegistrationBean<>(someServlet, "/some");
    }
}