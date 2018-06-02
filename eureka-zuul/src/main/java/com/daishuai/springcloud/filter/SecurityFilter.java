package com.daishuai.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/6/1 16:42
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class SecurityFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(SecurityFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        logger.info(">>>>>>>>>>>>>>>>>" + request.getMethod() + request.getRequestURI());
        if(token == null || "".equals(token.trim())){
            logger.info(">>>>>>>>>>>>>>>>>>> 没有权限！！！！");
            context.setSendZuulResponse(false);//过滤该请求，不让其路由
            context.setResponseStatusCode(401);//返回错误码
            context.set("isSucess",false);
            context.setResponseBody("没有访问权限！！！");
        }else{
            logger.info(">>>>>>>>>>>>>>>可以访问！！！");
            context.setSendZuulResponse(true);
            context.setResponseStatusCode(200);
            context.set("isSuccess",true);
        }

        return null;
    }
}
