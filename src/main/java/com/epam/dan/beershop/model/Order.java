package com.epam.dan.beershop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order extends BaseEntity{
    private boolean acceptedOrder;
    private String deliveryAdress;
    private Double total;
    private Date date;
    List<String> products = new ArrayList<String>();


    public boolean isAcceptedOrder() {
        return acceptedOrder;
    }

    public void setAcceptedOrder(boolean acceptedOrder) {
        this.acceptedOrder = acceptedOrder;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }



    public void createOrderItemList() {

        OrderItem orderItem = new OrderItem();

        products.add(orderItem.getS());

        for (String product : products) {
            System.out.println(product);
        }
    }

    public double countTotalSum(){
        for (String product:products
             ) {

        }return 0.0;
    }
}
