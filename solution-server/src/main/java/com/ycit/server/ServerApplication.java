package com.ycit.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chenxiaolei
 * @date 2020/8/26
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {

    public static void main(String[]args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
