package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<EdibleItem>orderItems;


    public List<EdibleItem> getOrderItems() {
        return orderItems;
    }

    public Order(){
        this.orderItems= new ArrayList<>();
    }

    public void addOrderItem(EdibleItem edible){
        orderItems.add(edible);
    }

    public double calculateTotal(){
        double total=0.00;
        for(EdibleItem i: orderItems){
            total += i.getCost();
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