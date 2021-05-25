package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Marks entry point of spring boot application
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //Can run this application as a normal Java class
        SpringApplication.run(DemoApplication.class, args);
    }
}
