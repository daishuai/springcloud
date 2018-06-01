package com.daishuai.springcloud.controller;

import com.daishuai.common.entity.ResponseVo;
import com.daishuai.springcloud.service.RefactorDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/31 21:00
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@RestController
@RequestMapping("/api")
public class RefactorController {

    @Autowired
    private RefactorDeptService service;

    @RequestMapping("/get/{id}")
    public ResponseVo getDept(Integer id){
        return service.get(id);
    }

    @RequestMapping("/all")
    public ResponseVo getAll(){
        return service.getAll();
    }
}
