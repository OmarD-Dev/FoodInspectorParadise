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

    public void addOrderItem(PriceableItem item){
        orderItems.add(item);
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
        StringBuilder builder = new StringBuilder();
        builder.append("Order Items\n");
        for (PriceableItem item : orderItems) {
            builder.append(item.toString());
            builder.append("\n");
        }
        builder.append(String.format("Total: $%.2f",calculateTotal()));
        return builder.toString();
    }

}