package com.daishuai.eurekaclient1.controller;

import com.daishuai.common.entity.Department;
import com.daishuai.common.entity.ResponseVo;
import com.daishuai.eurekaclient1.repository.DepartmentRepository;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/24 19:05
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@RestController
public class DepartmentController {

    private Logger logger = LoggerFactory.getLogger(DepartmentController.class);
    @Autowired
    private DepartmentRepository repository;

    @RequestMapping("/get/{id}")
    //@HystrixCommand(fallbackMethod = "hystrix_get")
    public ResponseVo get(@PathVariable("id") Integer id) throws InterruptedException {
        int sleepTime = new Random().nextInt(3000);
        logger.info("---------->SleepTime:" + sleepTime);
        Thread.sleep(sleepTime);
        Department department = repository.findOne(id);
        if(department == null){
            throw new RuntimeException();
        }
        return ResponseVo.successResponseVo(department);
    }

    @RequestMapping("/get")
    public ResponseVo getAll(){
        return ResponseVo.successResponseVo(repository.findAll());
    }

    public ResponseVo hystrix_get(@PathVariable("id") Integer id){
        Department dept = new Department();
        dept.setDepartment_id(id);
        dept.setDepartment_name("该id="+id+"的不萌不存在！！");
        return ResponseVo.successResponseVo(dept);
    }
}
