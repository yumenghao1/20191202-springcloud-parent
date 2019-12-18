package com.aaa.ymh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaWebRun7080 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaWebRun7080.class, args);
    }
}
