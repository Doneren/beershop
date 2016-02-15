package com.epam.dan.beershop.model;

public class Delivery extends SalesDepartment {

    Assembly assemblyReady = new Assembly();

    public void deliveryStatement(){
        if (assemblyReady.acceptAssembly()){
            System.out.println("Goods in transit."+getPosition()+" - "+getName()+" address: ");
        }
    }

}
