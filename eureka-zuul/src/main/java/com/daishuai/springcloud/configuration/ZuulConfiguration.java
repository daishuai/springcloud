package com.daishuai.springcloud.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/6/1 17:19
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@ConfigurationProperties("zuul.filter")
public class ZuulConfiguration {

    private String root;
    private Integer interval;

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }
}
