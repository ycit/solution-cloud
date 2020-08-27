package com.ycit.controller;

import com.ycit.service.HiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chenxiaolei
 * @date 2020/8/27
 */
@RestController
@RequestMapping("/hi")
public class HiController {

    @Resource
    private HiService hiService;

    @GetMapping
    public String hi() {
        return hiService.hi();
    }

}
