package org.example;

import java.util.ArrayList;

public class PremiumToppings {
    private ArrayList<Meat> meats = new ArrayList<>();
    private ArrayList<Cheese> cheeses = new ArrayList<>();


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

    public double getCheesePrice(int size, int extraCheese) {
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

    public double getTotalCheesePrice(int size){
        double d = 0;
        for(Cheese c: cheeses){
            d+= getCheesePrice(size,c.getExtra());
        }
        return d;
    }
    public double getTotalMeatPrice(int size){
        double d = 0;
        for(Meat m: meats){
            d+= getMeatPrice(size, m.getExtra());
        }
        return d;
    }

    public void addMeat(String meat) {

        Meat found = null;
        for (Meat m: meats){
            if (m.getName().equals(meat)){
                found = m;
            }
        }
        if (found == null) {
            this.meats.add(new Meat(meat, 0));
        } else {
            found.setExtra( found.getExtra() + 1);
        }
    }

    public void addCheese(String cheese) {

        Cheese found = null;
        for (Cheese c: cheeses){
            if (c.getName().equals(cheese)){
                found = c;
            }
        }
        if (found == null) {
            this.cheeses.add(new Cheese(cheese, 0));
        } else {
            found.setExtra( found.getExtra() + 1);
        }
    }



    public void displayMeat() {
        System.out.println("Meats: \n");
        int counter=1;
        for (Meat meat : meats) {
            System.out.println(counter +". " + meat);
            counter++;
        }
    }

    public void displayCheese() {
        System.out.println("Cheese: \n");
        int counter = 1;
        for (Cheese cheese : cheeses) {
            System.out.println(counter +". " + cheese);
            counter++;
        }
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Premium Toppings: ");
        for (Meat meat : meats) {
            result.append(meat).append(", ");
        }
        for (Cheese cheese : cheeses) {
            result.append(cheese).append(", ");
        }
        result.delete(result.length() - 2, result.length());
        return result.toString().trim();
    }
}
