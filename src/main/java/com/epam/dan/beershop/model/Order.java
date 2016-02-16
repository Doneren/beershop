package com.epam.dan.beershop.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private boolean acceptedOrder;
    private double quantity; //quantity of ordered type of product
    private String deliveryAdress;

    List<Product> productList = new ArrayList<Product>();

    public boolean isAcceptedOrder() {
        return acceptedOrder;
    }

    public void setAcceptedOrder(boolean acceptedOrder) {
        this.acceptedOrder = acceptedOrder;
    }


    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }
}
