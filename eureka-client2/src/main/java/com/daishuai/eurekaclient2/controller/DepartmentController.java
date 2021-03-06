package com.daishuai.eurekaclient2.controller;

import com.daishuai.common.entity.Department;
import com.daishuai.common.entity.ResponseVo;
import com.daishuai.common.feign.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/24 19:57
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@RestController
public class DepartmentController {

    @Autowired
    private DeptClientService service;

    private static final String PREFIX_URL = "http://localhost:7002/";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/dept/{id}")
    public ResponseVo get(@PathVariable("id") Integer id){
        //return restTemplate.getForObject(PREFIX_URL+"/rabbit/get/"+id, ResponseVo.class);
        return service.get(id);
    }
}
