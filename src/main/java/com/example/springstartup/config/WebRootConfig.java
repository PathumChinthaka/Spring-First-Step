package com.example.springstartup.config;

import com.example.springstartup.WebAppInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
@EnableWebMvc
public class WebRootConfig {
    public WebRootConfig(){
        System.out.println("I am Web root config");
    }
}
