package purchase;

public class Order {
    private boolean acceptOrder;

    public boolean acceptDelivery() {
        if (acceptOrder == true) {
            return true;
        } else return false;
    }

}
