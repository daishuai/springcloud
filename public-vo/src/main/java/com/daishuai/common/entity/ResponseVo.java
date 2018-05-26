package com.daishuai.common.entity;

import java.io.Serializable;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/26 14:21
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class ResponseVo implements Serializable {

    private String code;
    private String message;
    private Object body;

    public ResponseVo(){}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public ResponseVo(String code, String message, Object body) {
        this.code = code;
        this.message = message;
        this.body = body;
    }

    public static ResponseVo successResponseVo(Object body){
        return new ResponseVo("0","处理成功！",body);
    }

    public static ResponseVo errorResponseVo(Object body){
        return new ResponseVo("E1","处理失败",body);
    }
}
