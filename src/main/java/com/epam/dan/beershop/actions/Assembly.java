package com.epam.dan.beershop.actions;

import com.epam.dan.beershop.model.Order;

public class Assembly{

    Order order = new Order();

    public boolean acceptAssembly() {
        return order.isAcceptedOrder();
    }


    /*public void assemblingOrder() {
        if (acceptAssembly()) {
            System.out.println("Order assembled by " + getPosition() + " " + getName() + " and ready to delivery.");
            }
    }*/


}