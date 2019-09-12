package com.crm.crm.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {
    @Autowired
    private ContactRepository repository;

//    public DemoLoader(ContactRepository repository){
//        this.repository = repository;
//    }
    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Contact("Yunus", "Surname", "yunus@email.com"));
        this.repository.save(new Contact("Yunus", "Othersurname", "other@email.com"));
    }
}
