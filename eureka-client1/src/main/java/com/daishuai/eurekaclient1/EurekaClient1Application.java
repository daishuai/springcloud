package com.daishuai.eurekaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/24 14:41
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@SpringBootApplication
@EnableEurekaClient
@EntityScan(basePackages = {"com.daishuai.common.entity"})
@EnableCircuitBreaker
public class EurekaClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient1Application.class,args);
    }
}
