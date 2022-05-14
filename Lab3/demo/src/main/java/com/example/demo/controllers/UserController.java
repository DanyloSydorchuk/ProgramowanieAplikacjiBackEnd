package com.example.demo.controllers;

import org.springframework.stereotype.Controller;

import com.example.demo.models.UserEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {
    
    @Autowired
    public UsersService usersService;

    @RequestMapping(
        value="/api/users",
        method= RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Object getUsers(
        @RequestParam(name="page-number", defaultValue = "1") Integer pageNumber,
        @RequestParam(name="page-size", defaultValue = "20") Integer pageSize){
            return this.usersService.getUsers(pageNumber, pageSize);
        }
    
    
    // @RequestMapping("/api/users/add")
    // public String addUser(){
    //     return "addUser";
    // }


    @RequestMapping(
        value = "/api/user/create",
        method = RequestMethod.POST,
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public UserEntity createUser(@RequestBody UserEntity user) {
        this.usersService.createUser(user);
        return user;
    }

    // @RequestMapping("/api/users/{id}")
    // public String getUser(
    //     @RequestParam(name="id", defaultValue = "1") Integer id){
    //     return this.usersService.getUser(id);
    // }

    @RequestMapping("/api/users/{id}/update")
    public String updateUser(int id){
        return "updateUser";
    }

    @RequestMapping("/api/users/{id}/remove")
    public String removeUser(int id){
        return "removeUser";
    }
}
