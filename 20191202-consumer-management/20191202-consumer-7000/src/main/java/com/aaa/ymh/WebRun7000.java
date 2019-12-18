package com.aaa.ymh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WebRun7000 {
    public static void main(String[] args) {
        SpringApplication.run(WebRun7000.class, args);
    }
}
