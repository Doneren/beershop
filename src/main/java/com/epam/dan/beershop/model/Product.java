package com.epam.dan.beershop.model;

public class Product {

    private int price;
    private String name;
    private double sum;
    private String productType;

    public Product() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

}
