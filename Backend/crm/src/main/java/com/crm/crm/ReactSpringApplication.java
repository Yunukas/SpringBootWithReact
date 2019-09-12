package com.crm.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.crm.crm", "com.crm.crm.Controller", "com.crm.crm.Model"} )
public class ReactSpringApplication {
    public static void main(String[] args){
        SpringApplication.run(ReactSpringApplication.class, args);
    }
}
