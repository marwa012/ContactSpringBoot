package com.example.contactprojectSA.repository;

import com.example.contactprojectSA.modele.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Contactrepository extends JpaRepository<Contact,Long> {
}
