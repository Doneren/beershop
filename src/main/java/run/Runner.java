package run;

import interfaces.ProductInterface;
import product.Drink;

public class Runner {
    public static void main(String[] args) {
        ProductInterface beer1 = new Drink(355, "Praga", 1.5);
        System.out.println(beer1.getSum());
    }
}
