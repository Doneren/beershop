package com.epam.dan.beershop.model;

import com.epam.dan.beershop.actions.Assembly;

public class DeliveryDepartment extends SalesDepartment {

    Assembly assemblyReady = new Assembly();
    Order delivery = new Order();

    public void deliveryStatement(){
        if (assemblyReady.acceptAssembly()){
            System.out.println("Goods in transit."+getPosition()+" - "+getName()+" transports goods at: " + delivery.getDeliveryAdress());
        }
    }

    public void deliveryInfo(){// output delivery info for Delivery Department manager, filled Delivery (Order) List for print
        //employee (courier) information
        //client info: name, phone, delivery address
        deliveryStatement();
    }

}
