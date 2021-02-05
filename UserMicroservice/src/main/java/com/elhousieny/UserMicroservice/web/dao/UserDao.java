package com.elhousieny.UserMicroservice.web.dao;


import com.elhousieny.UserMicroservice.web.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public User getUser(Integer id){
        for (User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    private static List<User> users = new ArrayList<User>();

    static{
        users.add(new User(1, "Rany"));
        users.add(new User(2, "Sally"));
        users.add(new User(3, "Khalid"));

    }

    public List<User> getUsers(){
        return users;
    }


}
