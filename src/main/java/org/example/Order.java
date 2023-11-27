package org.example;

import java.util.ArrayList;

public class Order {
    ArrayList<sandwich> sandwiches = new ArrayList<>(); // all the sandwhiches in the oder... we can do this for the other stuff too later
    ArrayList<drinks> drinks = new ArrayList<>();
    ArrayList<chips> chips = new ArrayList<>();

    public void create_receipt(){
        // save the order to a csv file and have the oder, tax, tip?, and total seperated by commas or |


    }


    @Override
    public String toString() {
        return "";
        // this turns the entire order to a string to either be printed or be put into the csv

    }
}