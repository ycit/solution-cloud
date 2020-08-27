package com.ycit.feign;

import com.ycit.feign.fallback.HiClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chenxiaolei
 * @date 2020/8/27
 */
@FeignClient(value = "c1", fallback = HiClientFallback.class)
public interface HiClient {

    @GetMapping("/hi")
    String hi();

}
