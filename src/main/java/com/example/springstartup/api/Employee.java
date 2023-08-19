package com.example.springstartup.api;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/employee")
public class Employee {

    @GetMapping(params = {"id","name"})
    public String saveEmplyee(String id, String name, @RequestParam MultiValueMap<String,String> empData){
        System.out.println(empData);
        return String.format("EmpDetails(%s,%s)",id,name);
    }
}
