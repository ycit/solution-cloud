package com.ycit.openfeign.feign.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * @author chenxiaolei
 * @date 2020/7/31
 */
public class FeignPrivateInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        System.out.println("insert token private......");
        template.header("token", "private");
    }
}
