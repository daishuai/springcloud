package com.daishuai.common.feign;

import com.daishuai.common.entity.ResponseVo;
import com.daishuai.common.feign.fallback.DeptFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/25 10:33
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@FeignClient(value = "eureka-client1", fallbackFactory = DeptFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping("/get/{id}")
    ResponseVo get(@PathVariable("id") Integer id);

    @RequestMapping("/get")
    ResponseVo getAll();
}
