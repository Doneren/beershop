package com.epam.dan.beershop.model;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private double quantity;
    String s;

    public OrderItem(double quantity){

        this.quantity=quantity;

    }

    public OrderItem(String s){

        this.s = s;

    }
    public OrderItem(){

    }



    public void createProductList() {

        Product product1 = new Product("beer", "Carlsberg", 390.0, "liter");

        List<Product> productList = new ArrayList<Product>();

        productList.add(product1);

        s = product1.toString() + new OrderItem(getQuantity()).toString();

        System.out.println(s);


    }

    public void createOrderItemList (){
        OrderItem wer = new OrderItem(s);

        List<String> productsList1 = new ArrayList<String>();

        productsList1.add(s);

        for (String product : productsList1) {
            System.out.println(product);
       }
    }



    @Override
    public String toString() {
        return ", quantity=" + getQuantity() +
                '}';
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
