package com.example.springstartup.api;

import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Arrays;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class Employee {

    @GetMapping(params = {"id","name"})
    public String saveEmplyee(String id, String name, @RequestParam MultiValueMap<String,String> empData){
        System.out.println(empData);
        return String.format("EmpDetails(%s,%s)",id,name);
    }

    @PostMapping
    public String getMultiTypeData(String id,String country,String city,
        @RequestParam("towns") String[] towns,@RequestParam MultiValueMap<String,String>data)

    {
        System.out.println(id);
        System.out.println(country);
        System.out.println(city);
        System.out.println(Arrays.toString(towns));
        System.out.println(data);

        return "saved";
    }

    //Map-> {001,sl,panadura,aluthgama,kandu,nuwara,}
    //MultiValueMap->{id[001],country[sl],city[panadura],towns[kandy,matale]}
}
