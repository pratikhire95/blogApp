package com.ltim.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.blog.entity.User;
import com.ltim.blog.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class RegisterLoginController {

    @Autowired
    private UserService userService;
    
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user){
        return new ResponseEntity<User>(userService.registerUser(user), HttpStatus.CREATED);
    }
    
}
