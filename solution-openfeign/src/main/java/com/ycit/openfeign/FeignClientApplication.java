package com.ycit.openfeign;

import com.ycit.openfeign.feign.HiService;
import com.ycit.openfeign.feign.HiService2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 入口
 *
 * @author chenxiaolei
 * @date 2019/9/24
 */
@EnableFeignClients
@RestController
@SpringBootApplication
public class FeignClientApplication {

    @Resource
    private HiService hiService;

    @Resource
    private HiService2 hiService2;


    public static void main(String[]args) {
        SpringApplication.run(FeignClientApplication.class, args);
    }

    @RequestMapping("/hi")
    public void user() {
        hiService.hi("xlch");
        hiService2.hi("xlch");
    }

}
