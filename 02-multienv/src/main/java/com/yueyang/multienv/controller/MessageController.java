package com.yueyang.multienv.controller;

import com.yueyang.multienv.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: idea-work
 * @description:
 * @author: qinxiangyang
 * @create: 2020-04-04 21:24
 **/
@RestController
public class MessageController {
    @Autowired
    private MsgService msgService;

    @GetMapping("/send")
    public String sendHandle() {

        return msgService.send();
    }
}