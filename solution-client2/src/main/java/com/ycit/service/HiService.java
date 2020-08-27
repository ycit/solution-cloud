package com.ycit.service;

import com.ycit.feign.HiClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chenxiaolei
 * @date 2020/8/27
 */
@Service
public class HiService {

    @Resource
    private HiClient hiClient;

    public String hi() {
        return hiClient.hi();
    }
}
