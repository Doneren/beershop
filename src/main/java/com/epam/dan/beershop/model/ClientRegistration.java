package com.epam.dan.beershop.model;

public class ClientRegistration {
    private String name;
    private static int id;
    private String pathword;
    private String email;

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


    public void idAssignment (){
        int maxIdValueInDatabase;// gets maximal value of registered client from database
        id=maxIdValueInDatabase+1;
        setId(id);
    }
}
