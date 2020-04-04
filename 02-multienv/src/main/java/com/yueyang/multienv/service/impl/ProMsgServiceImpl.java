package com.yueyang.multienv.service.impl;

import com.yueyang.multienv.service.MsgService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @program: idea-work
 * @description:
 * @author: qinxiangyang
 * @create: 2020-04-04 21:18
 **/
@Service
@Profile("pro")
public class ProMsgServiceImpl implements MsgService {
    @Override
    public String send() {

        System.out.println("Pro  ProMsgServiceImpl--------------------------");
        return "pro";
    }
}