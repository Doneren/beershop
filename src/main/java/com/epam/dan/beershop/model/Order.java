package com.epam.dan.beershop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order extends BaseEntity{
    private boolean acceptedOrder;
    private String deliveryAdress;
    private Double total;
    private Date date;
    private Double findedPrice;
    private String sss;

    public Order() {
    }

    public boolean isAcceptedOrder() {
        return acceptedOrder;
    }

    public void setAcceptedOrder(boolean acceptedOrder) {
        this.acceptedOrder = acceptedOrder;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    public String getSss() {
        return sss;
    }

    public void setSss(String sss) {
        this.sss = sss;
    }

    public void createOrderItemList() {
        Order order = new Order();
        System.out.println(order.getSss());

       /* List<String> products = new ArrayList<String>();

        products.add(orderItem.getS());

        for (String product : products) {
            System.out.println(product);
        }*/

    }

   public void findPrice(){


       //OrderItem item = new OrderItem();System.out.println(item.getS());
       /*String res="";
        String [] arr;
        arr = item.getS().split("");
       for (int i=0; i<arr.length; i++){
            if (item.getS().startsWith("price=", i)) {res = arr[i+6];
                for (int j=0; j<10; j++){
                    if (!arr[i+6+j].matches(",")) {
                        res = res + arr[i+6+j];
                    } else break;
                }
            }
        }*/
       //System.out.println(res);
    }


}
