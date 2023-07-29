package com.example.springstartup.config;

import com.example.springstartup.WebAppInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = WebAppInitializer.class)
public class WebAppConfig {
    //this constructor will trigger without create an instance in Spring framework
    public WebAppConfig(){
        System.out.println("Hello Spring Mvc");
    }
}
