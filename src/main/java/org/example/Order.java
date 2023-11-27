package org.example;

import java.util.ArrayList;

public class Order {
    sandwich sandwich;
    ArrayList<sandwich> sandwiches = new ArrayList<>(); // all the sandwhiches in the oder... we can do this for the other stuff too later
    boolean drink; // we can make it alot more detailed later but for now drink is either yes or no
    boolean chips;// we can make it alot more detailed later but for now chips are either yes or no

    public void create_receipt(){
        // save the order to a csv file and have the oder, tax, tip?, and total seperated by commas or |


    }


    @Override
    public String toString() {
        return "";
        // this turns the entire order to a string to either be printed or be put into the csv

    }
}
