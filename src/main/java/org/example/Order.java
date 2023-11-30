package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<PriceableItem>orderItems;


    public List<PriceableItem> getOrderItems() {
        return orderItems;
    }

    public Order(){
        this.orderItems= new ArrayList<>();
    }

    public void addOrderItem(PriceableItem edible){
        orderItems.add(edible);
    }

    public double calculateTotal(){
        double total=0.00;
        for(PriceableItem i: orderItems){
            total += i.getPrice();
        }
        return total;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderItems=" + orderItems +
                '}';
    }
}