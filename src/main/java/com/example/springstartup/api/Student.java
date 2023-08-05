package com.example.springstartup.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
//@RequestMapping("/student/{id:s\\d{3}}")
public class Student {

    //Student id with Regex
    @GetMapping("student/{id:S\\d{3}}")
    public String getStudentData(@PathVariable String id){
        return "Get Student data "+id;
    }

    //Student id without regex
    @GetMapping("student/{id}*")
    public String getAnyStudentData(@PathVariable String id){
        return "Get Student data "+id;
    }

    //get Student data with tow parameters
    @GetMapping("student/{id}/{code}")
    public String getStudentDataWithTwoParams(@PathVariable String id,@PathVariable String code){
        return "First Param Id "+id+" And Code "+code;
    }
}
