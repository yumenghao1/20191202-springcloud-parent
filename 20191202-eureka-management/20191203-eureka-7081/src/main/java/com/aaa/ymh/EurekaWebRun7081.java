package com.aaa.ymh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaWebRun7081 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaWebRun7081.class, args);
    }
}
