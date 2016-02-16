package com.epam.dan.beershop;

import com.epam.dan.beershop.model.Client;
import com.epam.dan.beershop.model.OrderItem;
import com.epam.dan.beershop.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {


        OrderItem newList = new OrderItem();
        newList.setQuantity(2.5);

        newList.productArrayList();

       // System.out.println(newList.getQuantity());

    }
}
