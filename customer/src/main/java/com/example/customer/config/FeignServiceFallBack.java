package com.example.customer.config;

import com.example.customer.service.CustomerService;
import feign.hystrix.FallbackFactory;

public class FeignServiceFallBack implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new CustomerService() {
            @Override
            public String index() {
                return "生产者服务停用了";
            }
        };
    }
}
