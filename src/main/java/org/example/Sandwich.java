//TODO: add bread types and fill out totalCost method

package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sandwich {

    private int size;
    private Double cost;
    private List<Sandwich> sandwichList = new ArrayList<>();


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


    public Double totalCost(){
        return cost;
}


    /*
    come back to this method
   maybe use a switch case instead
    we may want this method to return back to the order screen
     */
    public boolean isToasted(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to toast your sandwich? (Y/N)");
        String choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"))
        {
            return true;
        }
        if(choice  .equalsIgnoreCase("n") || choice.equalsIgnoreCase("no"))
        {
            return false;
        }
        else
        {
            System.out.println("Not a valid option");
        }
        return false; //default


    }

}
