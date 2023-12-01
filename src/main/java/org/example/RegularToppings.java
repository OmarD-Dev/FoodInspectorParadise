package org.example;

import java.util.ArrayList;

public class RegularToppings{
    ArrayList<String> regToppings=new ArrayList<>();
    ArrayList<String> sauces=new ArrayList<>();
    ArrayList<String> sides= new ArrayList<>();


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
        int counter = 1;
        for (String toppings :  regToppings) {
            System.out.println(counter + ". " +  toppings);
            counter++;
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

    public void displaySides() {
        System.out.println("Sides: \n");
        int counter =1;
        for (String side : sides) {
            System.out.println(counter +". " +  side);
            counter++;
        }
    }

    @Override
    public String toString() {
        return "RegularToppings{" +
                "regToppings=" + regToppings +
                ", sauces=" + sauces +
                ", sides=" + sides +
                '}';
    }
}