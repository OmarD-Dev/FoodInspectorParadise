package org.example;

import java.util.ArrayList;

public class PremiumToppings implements EdibleItem {
    private ArrayList<String> meats = new ArrayList<>();;
    private ArrayList<String> cheeses = new ArrayList<>();


    /*
    NOTE: how will we implement extra meat and cheese in the order screen?
    Maybe prompt for the method in the meat selection screen
     */
    public double getMeatPrice(int size, int extraMeat) {
        double meatCost = 0.0;
        switch (size) {
            case 4:
                meatCost = 1.00;
                break;
            case 8:
                meatCost = 2.00;
                break;
            case 12:
                meatCost = 3.00;
                break;
            default:
                System.out.println("Not a valid size.");
                return 0.0;
        }
        return meatCost + (extraMeat * 0.5);
    }

    public Double getCheesePrice(int size, int extraCheese) {
        double cheeseCost = 0.0;
        switch (size) {
            case 4:
                cheeseCost = 0.75;
                break;
            case 8:
                cheeseCost = 1.00;
                break;
            case 12:
                cheeseCost = 2.25;
                break;
            default:
                System.out.println("Not a valid size.");
                return 0.0;
        }
        return cheeseCost + (extraCheese * 0.30);
    }

    public void addMeat(String meat) {
        this.meats.add(meat);
    }

    public void addCheese(String cheese) {
        this.cheeses.add(cheese);
    }



    public void displayMeat() {
        System.out.println("Meats: \n");
        int counter=1;
        for (String meat : meats) {
            System.out.println(counter +". " + meat);
            counter++;
        }
    }

    public void displayCheese() {
        System.out.println("Cheese: \n");
        int counter = 1;
        for (String cheese : cheeses) {
            System.out.println(counter +". " + cheese);
            counter++;
        }
    }

    @Override
    public double getCost() {
        return 0;
    }
}
