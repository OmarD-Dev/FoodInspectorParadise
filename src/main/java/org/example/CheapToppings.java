package org.example;

import java.util.ArrayList;

public class CheapToppings extends Toppings {
    ArrayList<String> regToppings;
    ArrayList<String> sauces;
    ArrayList<String> sides;

    public CheapToppings() {
        this.regToppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
        this.sides = new ArrayList<>();
        initializeToppings();
    }

    private void initializeToppings() {
        regToppings.add("Lettuce");
        regToppings.add("Peppers");
        regToppings.add("Onions");
        regToppings.add("Tomatoes");
        regToppings.add("Jalapenos");
        regToppings.add("Cucumbers");
        regToppings.add("Pickles");
        regToppings.add("Guacamole");
        regToppings.add("Mushrooms");

        sauces.add("Mayo");
        sauces.add("Mustard");
        sauces.add("Ketchup");
        sauces.add("Ranch");
        sauces.add("Thousand Islands");
        sauces.add("Vinaigrette");

        sides.add("Aus jus");

    }

    public void addRegTopping(String topping) {
        this.regToppings.add(topping);
    }

    public void addSauce(String sauce) {
        this.sauces.add(sauce);
    }

    public void addSide(String side) {
        this.sides.add(side);
    }

    public void displayRegToppings() {
        System.out.println("Regular Toppings: \n");
        for (String toppings :  regToppings) {
            System.out.println("- " +  toppings);
        }
    }

    public void displaySauces() {
        System.out.println("Sauces: \n");
        for (String sauce : sauces) {
            System.out.println("- " +  sauce);
        }
    }

    public void displaySides() {
        System.out.println("Sides: \n");
        for (String side : sides) {
            System.out.println("- " +  side);
        }
    }

    @Override
    public double getCost() {
        return 0;
    }
}