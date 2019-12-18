package com.aaa.ymh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/12/7 14:23
 * @Description
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulRun8888 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulRun8888.class, args);
    }

}
