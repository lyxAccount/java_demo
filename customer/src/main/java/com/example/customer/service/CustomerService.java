package com.example.customer.service;

import com.example.customer.config.FeignServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "provider-server", fallback = FeignServiceFallBack.class)
public interface CustomerService {
    @GetMapping("/index")
    String index();
}
