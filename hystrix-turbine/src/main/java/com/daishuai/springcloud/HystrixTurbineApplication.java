package com.daishuai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/30 15:31
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@SpringBootApplication
@EnableTurbine
@EnableEurekaClient
public class HystrixTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixTurbineApplication.class, args);
    }
}
