package com.daishuai.eurekaclient1.controller;

import com.daishuai.common.entity.Department;
import com.daishuai.common.entity.ResponseVo;
import com.daishuai.eurekaclient1.repository.DepartmentRepository;
import com.daishuai.springcloud.service.ApiDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/31 20:55
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@RestController
public class RefactorDeptController implements ApiDeptService {

    @Autowired
    private DepartmentRepository repository;

    @Override
    public ResponseVo get(Integer id) {
        Department department = repository.findOne(id);
        if(department == null){
            throw new RuntimeException();
        }
        return ResponseVo.successResponseVo(department);
    }

    @Override
    public ResponseVo getAll() {
        return ResponseVo.successResponseVo(repository.findAll());
    }
}
