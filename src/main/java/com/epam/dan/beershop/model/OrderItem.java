package com.epam.dan.beershop.model;

import com.sun.xml.internal.ws.binding.FeatureListUtil;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private double quantity;

    public OrderItem(Product product, double quantity){


    }

    public OrderItem(){

    }

    public void productArrayList () {

        Product product1 = new Product("beer", "Carlsberg", 390.0, "liter");

        OrderItem wer = new OrderItem(product1, getQuantity());

        List<OrderItem> productsList = new ArrayList<OrderItem>();

        productsList.add(wer);


        for (OrderItem product : productsList) {
            System.out.println(product);
        }
    }


    /*public String to1String(){
        OrderItem qwe = new OrderItem();
        return qwe.toString()+ "Quantity: "+getQuantity();
    }*/

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

}
