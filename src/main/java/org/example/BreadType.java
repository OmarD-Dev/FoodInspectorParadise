package org.example;

public enum BreadType {
    WHITE(5.50),
    WHEAT(5.50),
    RYE(5.50),
    WRAP(5.50);

    private final double cost;

    BreadType(double cost) {
        this.cost = cost;
    }

    public double getCost(){
        return cost;
    }
}
