package com.elhousieny.UserMicroservice.web.controller;
import java.util.List;
import com.elhousieny.UserMicroservice.web.dao.UserDao;
import com.elhousieny.UserMicroservice.web.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserDao userDao = new UserDao();
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id){
        return userDao.getUser(id);
    }


    @GetMapping("/users")
    public List<User> getUsers(){
        return userDao.getUsers();
    }


}

