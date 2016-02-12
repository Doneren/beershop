package run;

import client.Client;
import interfaces.ProductInterface;
import product.Drink;
import product.Product;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<ProductInterface> drinkList = new ArrayList<ProductInterface>();
      /*  ProductInterface order1 = new Drink(400, "beer", "Praga", 2.5);
        ProductInterface order2 = new Drink(290, "beer", "Bamberg", 3.0);
        ProductInterface order3 = new Drink(320, "beer", "Spacek", 1.0);
        ProductInterface order4 = new Drink(300, "beer", "Amber", 1.5);
        ProductInterface order5 = new Drink(1730, "beer", "Stella Artois", 1.0);
        ProductInterface order6 = new Drink(410, "beer", "Cesky Sladek", 2.5); */

       /* Runner runner = new Runner();
        runner.run();
        System.out.println((ProductInterface)order1);
*/
       /* drinkList.add(order1);
        drinkList.add(order2);
        drinkList.add(order3);
        drinkList.add(order4);
        drinkList.add(order5);
        drinkList.add(order6);*/

        for (ProductInterface drink:drinkList
             ) {
            System.out.println(drink);
            
        }
        Client client = new Client("Andrew","Swe 4");
        Client client1 = new Client("Sam","Swe 4");
        Client client2 = new Client("Sam","Swe 4");
        Client client3 = new Client("Sam","Swe 4");
        System.out.println(client.getId());
    }


    public void run (){
        ProductInterface order1 = new Drink(400, "beer", "Praga", 2.5);

    }
    

}
