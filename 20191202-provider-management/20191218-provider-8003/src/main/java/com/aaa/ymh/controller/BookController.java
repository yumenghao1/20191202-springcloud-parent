package com.aaa.ymh.controller;

import com.aaa.ymh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/listBooks")
    public Map<String, Object> selectAllBooks() throws Exception {
        if (true) {
            throw new Exception("111");
        }
        return bookService.selectAllBooks("8003");
    }
}
