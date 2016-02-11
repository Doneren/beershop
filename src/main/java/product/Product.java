package product;

import interfaces.ProductInterface;

public abstract class Product implements ProductInterface{

    protected int price;
    protected String name;
    protected double quantity;
    protected double sum;
    protected String productType;

    public Product() {
    }

    public Product(int price, String productType, String name, double quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }


    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

       public void setQuantity(double quantity) {
        this.quantity = quantity;
    }


    public double getQuantity() {
        return quantity;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

    public abstract void setSum ();

    public abstract double getSum();
}
