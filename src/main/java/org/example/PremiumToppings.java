package org.example;

import java.util.ArrayList;

public class PremiumToppings extends Toppings {
    private ArrayList<String> meats;
    private ArrayList<String> cheeses;

    public PremiumToppings() {
        this.meats = new ArrayList<>();
        this.cheeses = new ArrayList<>();
        initializeToppings();
    }

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

    private void initializeToppings() {
        meats.add("Steak");
        meats.add("Ham");
        meats.add("Salami");
        meats.add("Roast Beef");
        meats.add("Chicken");
        meats.add("Bacon");

        cheeses.add("American");
        cheeses.add("Provolone");
        cheeses.add("Cheddar");
        cheeses.add("Swiss");
    }

    public void addMeat(String meat) {
        this.meats.add(meat);
    }

    public void addCheese(String cheese) {
        this.cheeses.add(cheese);
    }

    public void displayMeat() {
        System.out.println("Meats: \n");
        for (String meat : meats) {
            System.out.println("- " + meat);
        }
    }

    public void displayCheese() {
        System.out.println("Cheese: \n");
        for (String cheese : cheeses) {
            System.out.println("- " + cheeses);
        }
    }
}
