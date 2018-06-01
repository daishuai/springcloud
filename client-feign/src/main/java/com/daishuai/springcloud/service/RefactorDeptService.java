package com.daishuai.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/31 21:00
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@FeignClient("EUREKA-CLIENT1")
public interface RefactorDeptService extends ApiDeptService {
}
