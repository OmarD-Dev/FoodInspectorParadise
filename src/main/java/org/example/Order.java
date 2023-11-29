package org.example;

import java.util.ArrayList;

public class Order {
    ArrayList<Sandwich> sandwiches ; // all the sandwiches in the oder... we can do this for the other stuff too later
    //ArrayList<Drinks> drinks = new ArrayList<>();


    //ArrayList<Chips> chips = new ArrayList<>();

    public Order(){
        this.sandwiches= new ArrayList<>();
    }

    public void addSandwich(Sandwich s){
        sandwiches.add(s);
    }

    public double calculateTotal(){
        double total=0.00;
        for(Sandwich s: sandwiches){
            total += s.sandwichCost();
        }
        return total;
    }



    @Override
    public String toString() {
        return "";
        // this turns the entire order to a string to either be printed or be put into the csv

    }
}