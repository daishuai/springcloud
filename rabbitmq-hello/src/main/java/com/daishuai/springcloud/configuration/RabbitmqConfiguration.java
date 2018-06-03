package com.daishuai.springcloud.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/6/3 14:48
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@Configuration
public class RabbitmqConfiguration {

    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}
