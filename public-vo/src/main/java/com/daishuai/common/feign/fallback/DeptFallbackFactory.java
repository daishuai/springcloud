package com.daishuai.common.feign.fallback;

import com.daishuai.common.entity.ResponseVo;
import com.daishuai.common.feign.DeptClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/26 14:18
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@Component
public class DeptFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public ResponseVo get(Integer id) {
                return ResponseVo.errorResponseVo("连接超时，请稍后再试！");
            }

            @Override
            public ResponseVo getAll() {
                return ResponseVo.errorResponseVo("连接超时，请稍后再试！");
            }
        };
    }
}
