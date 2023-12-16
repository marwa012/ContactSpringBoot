package com.example.contactprojectSA.controller;


import com.example.contactprojectSA.modele.Contact;
import com.example.contactprojectSA.repository.Contactrepository;
import com.example.contactprojectSA.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost/4200")
@RequestMapping("/contact")
public class ContactController {
    private final ContactService contactService;
    @Autowired
    private Contactrepository contactrepository;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }


    @PostMapping("/save")
    public Contact saveContact(@RequestBody Contact contact){
        return contactrepository.save(contact);



}
    @GetMapping("/getall")
    public List<Contact> getall() {
        return contactService.getall();
    }



    @DeleteMapping("/delete/{id}")
    public HashMap delete(@PathVariable Long id) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            contactrepository.deleteById(id);
            hashMap.put("etat", "contact supprimee");
            return hashMap;
        } catch (Exception e) {
            hashMap.put("etat", "contact non trouvee");
            return hashMap;
        }
    }
    @PutMapping("/update/{id}")
    public Contact modifiercontact(@RequestBody Contact contact, @PathVariable  Long id){
        contact.setId(id);
        Contact contactanc=contactrepository.getOne(id);
        if(contact.getName()==null){
            contact.setName(contactanc.getName());
        }if(contact.getUsername()==null){
            contact.setUsername(contactanc.getUsername());
        }if(contact.getEmail()==null){
            contact.setEmail(contactanc.getEmail());
        }if(contact.getPassword()==null){
            contact.setPassword(contactanc.getEmail());
        }
        contact.setId(id);
        contactrepository.saveAndFlush(contact);
        return contact;
    }




    @GetMapping("/getshow/{id}")
    public Contact getoneStage(@PathVariable Long id) {
        return contactrepository.getOne(id);
    }



}

