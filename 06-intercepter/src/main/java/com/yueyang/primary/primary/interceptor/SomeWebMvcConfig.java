package com.yueyang.primary.primary.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @program: 01-primary
 * @description: 配置类
 * @author: qinxiangyang
 * @create: 2020-04-05 18:08
 **/
@Configuration
public class SomeWebMvcConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        SomeInterceptor someInterceptor = new SomeInterceptor();
        //**表示多级目录,*表示一级目录
        registry.addInterceptor(someInterceptor)
                .addPathPatterns("/first/**")
                .excludePathPatterns("/second/**");
    }
}