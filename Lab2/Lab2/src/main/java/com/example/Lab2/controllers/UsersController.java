package com.example.Lab2.controllers;

import java.util.Map;


import com.example.Lab2.models.UserEntity;
import static java.util.Map.entry;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    int lp=1;
    
    Map<Integer, UserEntity> users = Map.ofEntries(entry(lp++, new UserEntity("Daniel", 22)),
                                                entry(lp++, new UserEntity("John", 23)));
    @RequestMapping("/users")
    Map<Integer, UserEntity> getUsers() {
        return users;
    }

    @RequestMapping("/user/{id}/get")
    UserEntity getUser(@PathVariable("id") int id) {
        return users.get(id);
    }

    @RequestMapping("/user/{id}/remove")
    UserEntity removeUser(@PathVariable("id") int id) {
        users.remove(id);
        return (UserEntity) users;
    }

    @RequestMapping("/user/add")
    UserEntity getUser(@RequestParam("name") String name, @RequestParam("age") int age) {
        entry(lp++, new UserEntity(name, age));
        return (UserEntity) users;
    }
   
}
