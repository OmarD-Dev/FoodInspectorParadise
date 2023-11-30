package org.example;

//comment
public enum DrinkSize {
    SMALL(2.00),
    MEDIUM(2.50),
    LARGE(3.00);

    private final double cost;

    DrinkSize(double cost) {
        this.cost = cost;
    }

    public double getDrinkCost() {
        return cost;
    }
}
