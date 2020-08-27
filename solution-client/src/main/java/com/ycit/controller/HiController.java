package com.ycit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenxiaolei
 * @date 2020/8/27
 */
@RestController
@RequestMapping("/hi")
public class HiController {

    @Value("${server.port}")
    String port;

    @GetMapping
    public String hi() {
        System.out.println("hi");
        return "i`m c1, from " + port;
    }

}
