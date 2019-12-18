package com.aaa.ymh.service;


import com.aaa.ymh.factory.IApiServiceFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(value = "test-provider", fallbackFactory = IApiServiceFallBackFactory.class)
public interface IApiService {
    @GetMapping("/listBooks")
    Map<String, Object> selectAllBooks();
}
