package com.aaa.ymh.factory;

import com.aaa.ymh.service.IApiService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class IApiServiceFallBackFactory implements FallbackFactory<IApiService> {
    @Override
    public IApiService create(Throwable throwable) {
        IApiService iApiService = new IApiService() {
            @Override
            public Map<String, Object> selectAllBooks() {
                Map<String, Object> map = new HashMap<>();
                map.put("code", "600");
                map.put("msg", "系统正在维护请稍后再试");
                return map;
            }
        };
        return iApiService;
    }
}
