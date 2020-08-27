package com.ycit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenxiaolei
 * @date 2020/8/27
 */
@RestController
public class ZuulTestController {

    @GetMapping("/test")
    public String hi() {
        return "hi, i`m c1";
    }

}
