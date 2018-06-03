package com.daishuai.springcloud.controller;

import com.daishuai.springcloud.sender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/6/3 14:41
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@RestController
public class HelloController {

    @Autowired
    private Sender sender;


    @RequestMapping(value = "/send",method = RequestMethod.GET)
    public void hello(String message){
        this.sender.send(message);
    }
}
