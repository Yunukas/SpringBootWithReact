package com.crm.crm.Controller;

import com.crm.crm.Model.Contact;
import com.crm.crm.Model.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.validation.Valid;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
class ContactsController {
    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/contacts")
    Collection<Contact> contacts() {
        return (Collection<Contact>) contactRepository.findAll();
    }

    @PostMapping("/contacts")
    ResponseEntity<Contact> createContact(@Valid @RequestBody Contact contact) throws URISyntaxException {
        Contact result = contactRepository.save(contact);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/contacts/delete/{id}")
    String deleteContact(@PathVariable Long id){
        Optional<Contact> contact = contactRepository.findById(id);
        if(contact.isPresent()){
            Contact foundContact = contact.get();
            contactRepository.delete(foundContact);
            return "Successfully deleted (id: " + id + ")";
        }
        return "User not found (id: " + id + ")";
    }
}
