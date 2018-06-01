package com.daishuai.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/6/1 15:59
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@Configuration
public class FeignConfiguration {


    @Bean
    Logger.Level feginLogLevel(){
        return Logger.Level.FULL;
    }
}
