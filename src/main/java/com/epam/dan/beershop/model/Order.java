package com.epam.dan.beershop.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private boolean acceptedOrder;
    private String deliveryAdress;

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
}
