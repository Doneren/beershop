package product;

public class Drink extends Product{
// class includes beer, lemonade, juice


    public Drink() {
    }

    public Drink(int price, String name, double quantity) {
        super(price, name, quantity);
        setSum();
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getQuantity() {
        return quantity;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    }
