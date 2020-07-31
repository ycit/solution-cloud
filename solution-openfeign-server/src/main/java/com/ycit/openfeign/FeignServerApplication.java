package com.ycit.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenxiaolei
 * @date 2019/9/24
 */
//@EnableDiscoveryClient
@SpringBootApplication
public class FeignServerApplication {

    public static void main(String[]args) {
        SpringApplication.run(FeignServerApplication.class, args);
    }

}
