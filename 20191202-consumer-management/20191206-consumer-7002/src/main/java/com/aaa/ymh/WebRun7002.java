package com.aaa.ymh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientName;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author YMH
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class WebRun7002 {
    public static void main(String[] args) {
        SpringApplication.run(WebRun7002.class, args);
    }
}
