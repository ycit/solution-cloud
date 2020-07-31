package com.ycit.openfeign.feign.config;

import org.springframework.context.annotation.Bean;

/**
 * @author chenxiaolei
 * @date 2020/7/31
 */
public class FeignConfig {

    @Bean
    public FeignPrivateInterceptor feignInterceptor() {
        return new FeignPrivateInterceptor();
    }

}
