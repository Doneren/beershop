package com.epam.dan.beershop.model;

import com.epam.dan.beershop.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private boolean acceptOrder;
    private double quantity; //quantity of ordered type of product

    List<Product> productList = new ArrayList<Product>();

    public boolean isAcceptOrder() {
        return acceptOrder;
    }

    public void setAcceptOrder(boolean acceptOrder) {
        this.acceptOrder = acceptOrder;
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



}
