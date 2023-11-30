package org.example.data;

import java.util.ArrayList;

public class PremiumToppingsDAO {
    private ArrayList<String> meats;
    private ArrayList<String> cheeses;

    public PremiumToppingsDAO() {
        this.meats = new ArrayList<>();
        this.cheeses = new ArrayList<>();
        initializeToppings();
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


    public void displayMeat() {
        System.out.println("Meats: \n");
        int counter=1;
        for (String meat : meats) {
            System.out.println(counter +". " + meat);
            counter++;
        }
    }

    public String getMeat(int counter) {
        if (counter > 0 && counter <= meats.size()) {
            return meats.get(counter - 1);
        } else {
            return null;
        }
    }

    public String getCheese(int counter) {
        if (counter > 0 && counter <= cheeses.size()) {
            return cheeses.get(counter - 1);
        } else {
            return null;
        }
    }

    public void displayCheese() {
        System.out.println("Cheese: \n");
        int counter = 1;
        for (String cheese : cheeses) {
            System.out.println(counter +". " + cheeses);
            counter++;
        }
    }


}
