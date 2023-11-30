package org.example;

public class Chips implements EdibleItem {
    private String flavor;
    public static final double cost = 1.50;

    @Override
    public double getCost() {
        return 0;
    }
    //enum for type of chips
    // we can also implement it as an int for size since the user isn't directly typing into the program it's up to us to store it


}