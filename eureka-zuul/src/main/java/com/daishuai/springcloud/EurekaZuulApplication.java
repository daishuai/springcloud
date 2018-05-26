package com.daishuai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/26 17:34
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@SpringBootApplication
@EnableZuulProxy
public class EurekaZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulApplication.class, args);
    }
}
