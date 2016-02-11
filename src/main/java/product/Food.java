package product;

import interfaces.ProductInterface;

public class Food extends Product{
//fish and crackers


    public Food() {
    }

    public Food(int price, String productType, String name, double quantity) {
        super(price, productType, name, quantity);
    }

    @Override
    public double getSum(){
        return sum;
    }

    @Override
    public void setSum() {
        sum = quantity*price;
    }
}
