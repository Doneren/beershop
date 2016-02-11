package product;

import interfaces.ProductInterface;

public abstract class Product implements ProductInterface{

    protected int price;
    protected String name;
    protected double quantity;
    private double sum;
    protected int id;

    public Product(String name, double quantity, int price){

    }

    public abstract int getPrice();

    public abstract void setPrice(int price);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract double getQuantity();

    public abstract void setQuantity(double quantity);

    public void setSum (){
        sum = quantity*price;
    }

    public double getSum() {
        return sum;
    }
}
