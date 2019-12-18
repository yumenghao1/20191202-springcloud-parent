package com.aaa.ymh.controller;

import com.aaa.ymh.service.IApiService;
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
    private IApiService service;

    @GetMapping("/")
    @ResponseBody
    public Map<String, Object> selectAllBooks() {
        return service.selectAllBooks();
    }
}
