package com.daishuai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/31 20:03
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class ClientFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientFeignApplication.class);
    }
}
