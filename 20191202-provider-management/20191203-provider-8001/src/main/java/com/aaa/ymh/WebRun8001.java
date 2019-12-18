package com.aaa.ymh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.aaa.ymh.mapper")
@EnableDiscoveryClient
@EnableCircuitBreaker
public class WebRun8001 {
    public static void main(String[] args) {
        SpringApplication.run(WebRun8001.class, args);
    }
}
