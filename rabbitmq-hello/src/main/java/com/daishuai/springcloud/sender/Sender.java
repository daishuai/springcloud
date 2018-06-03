package com.daishuai.springcloud.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/6/3 14:38
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send(String message){
        this.amqpTemplate.convertAndSend("hello",message);
    }
}
