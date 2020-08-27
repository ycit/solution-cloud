package com.ycit.feign.fallback;

import com.ycit.feign.HiClient;
import org.springframework.stereotype.Component;

/**
 * @author chenxiaolei
 * @date 2020/8/27
 */
@Component
public class HiClientFallback implements HiClient {

    public String hi() {
        return "sorry, hi method error!";
    }
}
