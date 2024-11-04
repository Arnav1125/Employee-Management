package com.example.Employee_Management.controller;


import com.example.Employee_Management.entity.ContactUs;
import com.example.Employee_Management.service.ContactUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactUsController {

    @Autowired
    private ContactUsService contactUsService;

    @GetMapping
    public List<ContactUs> getAllMessages() {
        return contactUsService.getAllMessages();
    }

    @PostMapping
    public ResponseEntity<ContactUs> createMessage(@RequestBody ContactUs contactUs) {
        ContactUs savedMessage = contactUsService.saveMessage(contactUs);
        return ResponseEntity.ok(savedMessage);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMessage(@PathVariable Long id) {
        contactUsService.deleteMessage(id);
        return ResponseEntity.noContent().build();
    }
}
