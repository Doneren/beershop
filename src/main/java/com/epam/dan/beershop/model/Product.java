package com.epam.dan.beershop.model;

import java.util.ArrayList;
import java.util.List;

public class Product extends BaseEntity{

    private double price;
    private String name;

    public Product() {
    }

    public enum Type {
        BEER, LEMONADE, JUICE, FISH, CRACKERS
    }

    Type type;

    public enum Unit {
        KG, LITER, PACK;
    }

    Unit unit;

    public Product (Integer productId, String productType, String name, double price, String unit){
        if (productId != null){
        setId(productId);}
        else {System.out.println("Wrong product id!");
        }

        this.name = name;
        this.price = price;
        if (productType == "beer"){type=Type.BEER;}
        else if (productType=="lemonade") {type=Type.LEMONADE;}
        else if (productType=="juice") {type=Type.JUICE;}
        else if (productType=="fish") {type=Type.FISH;}
        else if (productType=="crackers") {type=Type.CRACKERS;}
        else {
            System.out.println("ENTERED WRONG TYPE OF PRODUCT");
        }
        if (unit == "kg"){this.unit=Unit.KG;}
        else if (unit=="liter") {this.unit=Unit.LITER;}
        else if (unit=="pack") {this.unit=Unit.PACK;}
        else {
            System.out.println("ENTERED WRONG UNIT ");
        }

        }


    public Type getType() {
        return type;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setName(String name) {


        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public String toString() {
        return "Product:" +
                "id=" + getId() +
                ", price=" + getPrice() +
                ", name='" + getName() + '\'' +
                ", type=" + getType() +
                ", unit=" + getUnit() ;
    }
}
