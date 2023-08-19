package com.example.springstartup.api;

import com.example.springstartup.dto.JsonData;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//expose an endpoint
@RequestMapping("jsonhandler")

public class JSONHandler {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JsonData>getJsonData(){
        return new ResponseEntity<JsonData>(new JsonData("J001","Kamal","panadura"),
                HttpStatus.CREATED);
    }
}
