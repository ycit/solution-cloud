package com.ycit.openfeign.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenxiaolei
 * @date 2019/9/24
 */
@Slf4j
@RestController
public class HiController {

    @RequestMapping("/hi/{name}")
    public void hi(@PathVariable("name")String name) {
        log.info("hi, [{}]", name);
    }

}
