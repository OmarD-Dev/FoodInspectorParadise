package org.example;

public class PremiumToppings {
    //price and name of the toppings
    // we can add other methods later to make it more unique

    String[] meat = {"steak", "ham","salami", "roast beef", "chicken", "bacon"};
    String[] cheese = {"american", "provolone", "cheddar", "swiss"};

    public Double getMeatPrice(int size){
        switch(size){
            case 4:
                return 1.00;
            case 8:
                return 2.00;
            case 12:
                return 3.00;
            default:
                return  0.0;
        }
    }

    public Double addExtraMeat(int size){
        switch(size){
            case 4:
                return 0.50;
            case 8:
                return 1.00;
            case 12:
                return 1.50;
            default:
                return  0.0;
        }
    }
    /*
    Meats: steak, ham, salami, roast beef, chicken, bacon
    4" 1.00
    8" 2.00
    12" 3.00
    Extra meat 0.5, 1.00, 1.50

    Cheese: american, provolone, cheddar, swiss
    4" 0.75
    8" 1.00
    12" 2.25

    Extra cheese 0.30, 0.60, 0.90

     */




}
