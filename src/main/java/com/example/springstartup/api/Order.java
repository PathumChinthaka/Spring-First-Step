package com.example.springstartup.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/order")
public class Order {

    @ResponseStatus(HttpStatus.CREATED)

    //get Json Media type Request
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveOrderJson(){
        return "Save Order JSON";
    }
    //get XML type Request
    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public String saveOrderXml(){
        return "Save Order XML";
    }
}
