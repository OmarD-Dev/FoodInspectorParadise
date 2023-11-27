package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sandwich {

    private int size;
    boolean toasted;
    // other stuff

    /*
    parameterized constructor
    may include bread type
    or replace with a default constructor (no param)
     */
    public Sandwich(int size){
        this.size = size;
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
