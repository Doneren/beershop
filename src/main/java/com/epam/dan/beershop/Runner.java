package com.epam.dan.beershop;

import com.epam.dan.beershop.model.OrderItem;

public class Runner {
    public static void main(String[] args) {


        OrderItem newList = new OrderItem();

        newList.setQuantity(2.5);

        newList.createProductList();

        newList.createOrderItemList();
    }
}
