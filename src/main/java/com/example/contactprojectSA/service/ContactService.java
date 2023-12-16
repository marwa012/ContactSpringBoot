package com.example.contactprojectSA.service;


import com.example.contactprojectSA.modele.Contact;
import com.example.contactprojectSA.repository.Contactrepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.List;

@Service
public class ContactService {
    private final Contactrepository contactrepository;

    public ContactService(Contactrepository contactrepository) {
        this.contactrepository = contactrepository;
    }
    public List<Contact> getall(){
        return contactrepository.findAll();
    }

    public void addNew(Contact contact) {
        System.out.println(contact);
    }




}
