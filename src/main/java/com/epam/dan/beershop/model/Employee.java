package com.epam.dan.beershop.model;

public class Employee extends BaseEntity{
    private String name;
    private String position;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }
}
