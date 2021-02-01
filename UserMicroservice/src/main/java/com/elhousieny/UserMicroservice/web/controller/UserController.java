package com.elhousieny.UserMicroservice.web.controller;

import com.elhousieny.UserMicroservice.web.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUserName(){
        return new User("I am a User");
    }
}

