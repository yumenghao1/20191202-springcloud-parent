package com.aaa.ymh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Controller
public class BookController {
    private static final String LIST_BOOK_URL = "http://BOOK-PROVIDER/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    @ResponseBody
    public Map<String, Object> selectAllBooks() {
        return restTemplate.getForObject(LIST_BOOK_URL+"listBooks", Map.class);
    }
}
