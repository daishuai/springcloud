package com.daishuai.springcloud.service;

import com.daishuai.common.entity.ResponseVo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/31 20:40
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@RequestMapping("/refactor")
public interface ApiDeptService {

    @RequestMapping("/get/{id}")
    public ResponseVo get(@PathVariable("id") Integer id);

    @RequestMapping("/all")
    public ResponseVo getAll();
}
