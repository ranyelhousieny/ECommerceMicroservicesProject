package com.elhousieny.UserMicroservice.web.controller;

import com.elhousieny.UserMicroservice.web.dao.UserDao;
import com.elhousieny.UserMicroservice.web.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserDao userDao = new UserDao();
    @GetMapping("/users")
    public List<User> getUserName(){
        return userDao.getUsers();
    }
}

