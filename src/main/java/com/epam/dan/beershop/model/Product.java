package com.epam.dan.beershop.model;

public class Product {

    private double price;
    private String name;
    private String productType;

    public Product() {
    }

    public enum Unit {
        KG, LITER, PACK;
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

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

}
