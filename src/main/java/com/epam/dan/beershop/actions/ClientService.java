package com.epam.dan.beershop.actions;

public class ClientService {
    private String name;
    private int id;
    private String pathword;
    private String email;
    private int phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPathword() {
        return pathword;
    }

    public void setPathword(String pathword) {
        this.pathword = pathword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void idAssignment (){
        int maxIdValueInDatabase=0;
        // gets maximal id of registered client from database
        id=maxIdValueInDatabase+1;
        setId(id);
        setIdToDatabase(id);

    }

    public void setIdToDatabase(int id){
        // method sets id to database for just created account
    }

    public void setClientInfoToDatabase(){//action by pression "Confirm Registration" button
        getName();// adding Name to database
        getEmail();// adding Email
        getPathword();//same action
        getPhoneNumber();//same action
        idAssignment();
    }
}
