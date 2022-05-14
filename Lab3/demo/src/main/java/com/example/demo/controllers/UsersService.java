package com.example.demo.controllers;

import java.util.ArrayList;


import javax.annotation.PostConstruct;

import com.example.demo.models.UserEntity;
import com.example.demo.responses.UsersPage;

import org.springframework.stereotype.Service;

@Service
public class UsersService {
    private ArrayList<UserEntity> users = new ArrayList<>();


    @PostConstruct
    private void onConstruct(){
        this.users.add(new UserEntity(1,"Daniel","danylo.sydorchuk@microsoft.wsei.edu.pl"));
        this.users.add(new UserEntity(2,"Adam","adam.nazwisko@microsoft.wsei.edu.pl"));
        this.users.add(new UserEntity(3,"Marek","Marek.nazwisko@microsoft.wsei.edu.pl"));
    }

    public UsersPage getUsers(int pageNumber, int pageSize){
        pageNumber = Math.max(1, pageNumber);
        pageSize = Math.max(1,pageSize);
        pageSize = Math.min(100,pageSize);

        int totalCount = 0;
        int pagesCount = 0;

        return new UsersPage(pageNumber,pagesCount,pageSize,totalCount,this.users);
    }

    public void createUser(UserEntity user){
        this.users.add(user);
    }

    public void getUser(int id){
        this.users.get(id);
    }
}
