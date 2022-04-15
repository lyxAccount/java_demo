package com.example.customer.controller;

import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CustomerController {

    @Autowired
    private CustomerService customer;

    @GetMapping("/test")
    public String test(){
        String index = customer.index();
        return index;
    }
}
