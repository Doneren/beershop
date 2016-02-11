package product;

public class Drink extends Product{
// class includes beer, lemonade, juice


    public Drink() {
    }

    public Drink(int price, String productType, String name, double quantity) {
        super(price, productType, name, quantity);
        setSum();
    }

    @Override
    public double getSum(){
        return sum;
    }

    @Override
    public void setSum() {
       sum = quantity*price;
    }

    @Override
    public String toString() {
        return productType+" "+name+" "+price+" "+quantity;
    }
}
