package com.example.springstartup.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class Item {

    // get data using params
    @GetMapping(params = "data")
    public String getItemWithParam(@RequestParam String data){
        return "Get item "+data;
    }

    // get request header
    @PostMapping(headers = "X-token")
    public String setItemWithCustomToken(@RequestHeader("X-token") String token){
        return "Saved the item As :"+token;
    }
}
