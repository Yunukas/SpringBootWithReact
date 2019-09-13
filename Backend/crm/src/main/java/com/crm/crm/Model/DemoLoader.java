package com.crm.crm.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {
    @Autowired
    private ContactRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Contact("John", "Doe", "john@email.com"));
        this.repository.save(new Contact("Jane", "Doe", "jane@email.com"));
    }
}
