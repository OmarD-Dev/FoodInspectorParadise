package org.example.data;

import java.util.ArrayList;

public class RegularToppingsDAO {
    ArrayList<String> regToppings;
    ArrayList<String> sauces;
    ArrayList<String> sides;

    public RegularToppingsDAO() {
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

    public void displayRegToppings() {
        System.out.println("Regular Toppings: \n");
        int counter = 1;
        for (String toppings :  regToppings) {
            System.out.println(counter + ". " +  toppings);
            counter++;
        }
    }
    public String getRegTopping(int counter) {
        if (counter > 0 && counter <= regToppings.size()) {
            return regToppings.get(counter - 1);
        } else {
            return null;
        }
    }

    public void displaySauces() {
        System.out.println("Sauces: \n");
        int counter = 1;
        for (String sauce : sauces) {
            System.out.println( counter + ". " +  sauce);
            counter++;
        }
    }
    public String getSauces(int counter) {
        if (counter > 0 && counter <= sauces.size()) {
            return sauces.get(counter - 1);
        } else {
            return null;
        }
    }

    public void displaySides() {
        System.out.println("Sides: \n");
        int counter =1;
        for (String side : sides) {
            System.out.println(counter +". " +  side);
            counter++;
        }
    }
    public String getSides(int counter) {
        if (counter > 0 && counter <= sides.size()) {
            return sides.get(counter - 1);
        } else {
            return null;
        }
    }

}