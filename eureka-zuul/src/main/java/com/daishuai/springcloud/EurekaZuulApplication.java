package com.daishuai.springcloud;

import com.daishuai.springcloud.configuration.ZuulConfiguration;
import com.netflix.zuul.FilterFileManager;
import com.netflix.zuul.FilterLoader;
import com.netflix.zuul.groovy.GroovyCompiler;
import com.netflix.zuul.groovy.GroovyFileFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/26 17:34
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@SpringBootApplication
@EnableZuulProxy
@EnableConfigurationProperties({ZuulConfiguration.class})
public class EurekaZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulApplication.class, args);
    }


    @RefreshScope
    @ConfigurationProperties("zuul")
    ZuulProperties zuulProperties(){
        return new ZuulProperties();
    }

    @Bean
    FilterLoader filterLoader(ZuulConfiguration configuration){
        FilterLoader filterLoader = FilterLoader.getInstance();
        filterLoader.setCompiler(new GroovyCompiler());

        FilterFileManager.setFilenameFilter(new GroovyFileFilter());
        try {
            FilterFileManager.init(configuration.getInterval(),configuration.getRoot()+"/pre");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filterLoader;
    }
}
