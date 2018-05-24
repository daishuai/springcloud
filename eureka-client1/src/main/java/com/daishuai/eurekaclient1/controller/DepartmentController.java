package com.daishuai.eurekaclient1.controller;

import com.daishuai.common.entity.Department;
import com.daishuai.eurekaclient1.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/24 19:05
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;

    @RequestMapping("/get/{id}")
    public Department get(@PathVariable("id") Integer id){
        Department department = repository.findOne(id);
        return department;
    }

    @RequestMapping("/get")
    public List<Department> getAll(){
        return repository.findAll();
    }
}
