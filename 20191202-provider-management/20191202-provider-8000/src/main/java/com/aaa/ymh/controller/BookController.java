package com.aaa.ymh.controller;

import com.aaa.ymh.service.BookService;
import com.aaa.ymh.service.IApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private IApiService iApiService;

//    @GetMapping("/listBooks")
//    public Map<String, Object> selectAllBooks() throws Exception {
////        int i = 1 / 0;
//        return bookService.selectAllBooks("8000");
//    }

    @GetMapping("/test1")
    @ResponseBody
    public Map<String, Object> selectAllBooks() {
        return iApiService.selectAllBooks();
    }
}
