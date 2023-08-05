package com.example.springstartup.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/customer")

//this request mapping used for dynamically changeing url patterns
//@RequestMapping("/custome?")

//while card mapping
@RequestMapping("/customer/*")
public class Customer {
    @PostMapping
    public String saveCustomer(){
        return "Customer Saved";
    }
    @GetMapping
    public String getCustomer(){
        return "Customer get";
    }
}
