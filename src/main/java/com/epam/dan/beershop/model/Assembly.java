package com.epam.dan.beershop.model;

public class Assembly extends SalesDepartment {

    Order order = new Order();

    public boolean acceptAssembly() {
        return order.isAcceptOrder();
    }


    public void assemblingOrder() {
        if (acceptAssembly()) {
            System.out.println("Order assembled by " + getPosition() + " " + getName() + " and ready to delivery.");
            }
    }


}