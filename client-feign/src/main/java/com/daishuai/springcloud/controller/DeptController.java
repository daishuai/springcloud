package com.daishuai.springcloud.controller;

import com.daishuai.common.entity.ResponseVo;
import com.daishuai.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/31 20:16
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping("/feign/get/{id}")
    public ResponseVo getDept(@PathVariable("id") Integer id){
        return deptService.get(id);
    }

    @RequestMapping("/feign/all")
    public ResponseVo getAll(){
        return deptService.getAll();
    }
}
