package com.daishuai.springcloud.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/6/4 19:52
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@EnableBinding(Sink.class)
public class SinkReceiver {

    private Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receiver(Object played){
        logger.info(">>>>>>>>>>>>>>>>>>>Receiver:" + played);
    }
}
