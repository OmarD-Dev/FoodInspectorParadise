package org.example;

import java.util.ArrayList;
import java.util.PropertyResourceBundle;

public class Drink implements PriceableItem {
    private DrinkFlavor drinkType;
    private DrinkSize drinkSize;

    public Drink(DrinkFlavor drinkType, DrinkSize drinkSize) {
        this.drinkType = drinkType;
        this.drinkSize = drinkSize;
    }


    @Override
    public double getPrice() {
        switch (drinkSize){
            case SMALL:
                return 2.00;

            case MEDIUM:
                return 2.50;

            case LARGE:
                return 3.00;

        }
        return 0;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkType=" + drinkType +
                ", drinkSize=" + drinkSize +
                '}';
    }
}