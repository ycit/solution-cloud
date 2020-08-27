package com.ycit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenxiaolei
 * @date 2020/8/27
 */
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class ClientApplication {

    public static void main(String[]args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}
