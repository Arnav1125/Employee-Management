package com.example.Employee_Management.service;



import com.example.Employee_Management.entity.ContactUs;
import com.example.Employee_Management.repository.ContactUsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactUsService {

    @Autowired
    private ContactUsRepository contactUsRepository;

    public List<ContactUs> getAllMessages() {
        return contactUsRepository.findAll();
    }

    public ContactUs saveMessage(ContactUs contactUs) {
        return contactUsRepository.save(contactUs);
    }

    public void deleteMessage(Long id) {
        contactUsRepository.deleteById(id);
    }

 
}
