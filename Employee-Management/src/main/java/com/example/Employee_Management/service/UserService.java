package com.example.Employee_Management.service;

import com.example.Employee_Management.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final String storedEmail = "test@example.com";
    private static final String storedPassword = "password"; 

    public User authenticate(String email, String password) {
        if (email.equals(storedEmail) && password.equals(storedPassword)) {
            User user = new User();
            user.setEmail(email);
          
            return user; 
        }
        return null; 
    }
}
