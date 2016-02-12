package purchase;

import interfaces.ProductInterface;
import product.Drink;
import product.Food;

public class ShoppingCart{

    private double sum;

    ShoppingCart cart ;


    public double setSum(){
        sum = Drink.getSum() + Food.getSum();
        return sum;
    }
}
