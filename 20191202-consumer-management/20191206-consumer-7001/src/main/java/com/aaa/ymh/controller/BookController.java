package com.aaa.ymh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Controller
public class BookController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/")
    @ResponseBody
    public Map<String, Object> selectAllBooks() {
        ServiceInstance choose = loadBalancerClient.choose("book-provider");
        String host = choose.getHost();
        int port = choose.getPort();
        System.out.println("http://" + host + ":" + port + "/listBooks");
        return restTemplate.getForObject("http://" + host + ":" + port + "/listBooks",Map.class);
    }
}
