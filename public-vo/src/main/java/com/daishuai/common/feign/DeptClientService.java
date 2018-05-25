package com.daishuai.common.feign;

import com.daishuai.common.entity.Department;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/25 10:33
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@FeignClient(value = "eureka-client1")
public interface DeptClientService {

    @RequestMapping("/get/{id}")
    Department get(@PathVariable("id") Integer id);

    @RequestMapping("/get")
    List<Department> getAll();
}
