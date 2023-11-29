//TODO: add bread types and fill out totalCost method

package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sandwich {

    private final int SMALL = 4;
    private final int MEDIUM = 8;
    private final int LARGE = 12;
    private int size;
    private Double cost;
     List<Sandwich> sandwichList = new ArrayList<>();


//default constructor
    public Sandwich() {

    }


    /*
            parameterized constructor
            may include bread type
            or replace with a default constructor (no param)
             */
    public Sandwich(int size){

        this.size = size;
    }




    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }




    public Double totalCost(){
        return cost;
}


    /*
    come back to this method
    we may want this method to return back to the order screen
     */
    public boolean isToasted(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to toast your sandwich? (Y/N)");
        String choice = scanner.nextLine().toLowerCase();

        switch (choice){
            case "y", "yes":
                System.out.println("Toasted.");
                return true;
            case "n", "no":
                System.out.println("Un-toasted.");
                return false;
            default:
                 System.out.println("Not a valid option");
        }
        return false; //default


    }





}
