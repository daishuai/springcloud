package com.daishuai.springcloud.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/6/3 14:45
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    private Logger logger = LoggerFactory.getLogger(Receiver.class);


    @RabbitHandler
    public void hand(String hello){
        logger.info("监听到消息：" + hello);
    }

}
