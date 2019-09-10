package com.crm.crm.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
