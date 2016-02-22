package com.epam.dan.beershop.model;

import java.util.ArrayList;
import java.util.List;

public class OrderItem extends BaseEntity{
    private double quantity;
   // private String s;

    public OrderItem(double quantity) {

        this.quantity = quantity;

    }

    public OrderItem() {


    }


    public void createProductList() {

        Product product1 = new Product(101, "beer", "Carlsberg", 390.0, "liter");

        List<Product> productList = new ArrayList<Product>();

        productList.add(product1);

        Order order = new Order();

        order.setSss(product1.toString() + new OrderItem(getQuantity()).toString());

        System.out.println(order.getSss());


    }

    @Override
    public String toString() {
        return ", quantity=" + getQuantity();
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

   // public String getS() {
     //   return s;
    //}

    //public void setS(String s) {
    //    this.s = s;
   // }
}
