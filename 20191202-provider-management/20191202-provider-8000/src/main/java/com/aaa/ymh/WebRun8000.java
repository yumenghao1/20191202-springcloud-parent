package com.aaa.ymh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@MapperScan("com.aaa.ymh.mapper")
@EnableDiscoveryClient
@EnableFeignClients
public class WebRun8000 {
    public static void main(String[] args) {
        SpringApplication.run(WebRun8000.class, args);
    }
}
