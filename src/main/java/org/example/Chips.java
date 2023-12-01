package org.example;

public class Chips implements PriceableItem {
    private ChipFlavor flavor;
    public static final double cost = 1.50;

    public Chips(ChipFlavor flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "flavor=" + flavor +
                '}';
    }

    @Override
    public double getPrice() {
        return cost;
    }
    //enum for type of chips
    // we can also implement it as an int for size since the user isn't directly typing into the program it's up to us to store it


}