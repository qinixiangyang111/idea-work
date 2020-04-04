package com.yueyang.primary.primary.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: 01-primary
 * @description:
 * @author: qinxiangyang
 * @create: 2020-04-04 22:58
 **/
@Data
@Component
@PropertySource("classpath:custom.properties")
@ConfigurationProperties("group")
public class GroupUsersDto {

    private List<StudentDto> users;
}