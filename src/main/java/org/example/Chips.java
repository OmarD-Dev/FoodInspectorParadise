package org.example;

public class Chips implements PriceableItem {
    private ChipFlavor flavor;
    public static final double cost = 1.50;

    public Chips(ChipFlavor flavor) {
        this.flavor = flavor;
    }


    @Override
    public String toString() {
            return String.format("Chips - Flavor: %s $%.2f", flavor,getPrice());
    }


    @Override
    public double getPrice() {
        return cost;
    }

}