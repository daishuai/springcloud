package com.daishuai.springcloud.service.fallback;

import com.daishuai.common.entity.ResponseVo;
import com.daishuai.springcloud.service.DeptService;
import org.springframework.stereotype.Component;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/6/1 15:44
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@Component
public class DeptServiceFallback implements DeptService {
    @Override
    public ResponseVo get(Integer id) {
        return ResponseVo.errorResponseVo("调用接口出错，请稍后重试！");
    }

    @Override
    public ResponseVo getAll() {
        return ResponseVo.errorResponseVo("调用接口出错，请稍后重试！");
    }
}
