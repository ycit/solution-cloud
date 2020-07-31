package com.ycit.openfeign.feign.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenxiaolei
 * @date 2020/7/31
 */
@Configuration
public class FeignCommonInterceptor implements RequestInterceptor {


    @Override
    public void apply(RequestTemplate template) {
        System.out.println("insert token common....");
        template.header("token", "common");
    }
}
