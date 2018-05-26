package com.daishuai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/26 17:15
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer2Application.class, args);
    }
}
