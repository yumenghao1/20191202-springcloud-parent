package com.aaa.ymh.service;

import com.aaa.ymh.mapper.BookMapper;
import com.aaa.ymh.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public Map<String, Object> selectAllBooks(String provider) {
        Map<String, Object> map = new HashMap<>();
        List<Book> books = bookMapper.selectAll();
        if (null != books) {
            map.put("code", "200");
            map.put("msg", "操作成功");
            map.put("provider", provider);
            map.put("data", books);
        } else {
            map.put("code", "500");
            map.put("msg", "系统正在维护中");
        }
        return map;
    }
}
