package salesDepartment;

import client.Client;
import purchase.Order;

public class Delivery extends SalesDepartment{

    Assembly assemblyReady = new Assembly();

    public void deliveryStatement(){
        if (assemblyReady.acceptAssembly()){
            System.out.println("Goods in transit."+getPosition()+" - "+getName()+" address: ");
        }
    }

}
