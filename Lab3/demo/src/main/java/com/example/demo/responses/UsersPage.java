package com.example.demo.responses;

import java.util.List;

import com.example.demo.models.UserEntity;

public class UsersPage {
    private int pageNumber;
    private int pagesCount;
    private int pageSize;
    private int totalCount;

    private List<UserEntity> users;
    

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users){
        this.users = users;
    }

    public UsersPage(){
        
    }
    
    public UsersPage(int pageNumber, int pagesCount, int pageSize, int totalCount, List<UserEntity> users){
        this.pageNumber=pageNumber;
        this.pageSize=pageSize;
        this.pagesCount=pagesCount;
        this.totalCount=totalCount;
        this.users = users;
    }
    

    
    public void setPageNumber(int pageNumber){
        this.pageNumber = pageNumber;
    }
    public void setPagesCount(int pagesCount){
        this.pagesCount = pagesCount;
    }
    public void setPageSize(int pageSize){
        this.pageSize = pageSize;
    }
    public void setTotalCount(int totalCount){
        this.totalCount=totalCount;
    }
    public int getPageNumber(int pageNumber){
        return pageNumber;
    }
    public int getPagesCount(int pagesCount){
        return pagesCount;
    }
    public int getPageSize(int pageSize){
        return pageSize;
    }
    public int getTotalCount(int totalCount){
        return totalCount;
    }

    
    
}
