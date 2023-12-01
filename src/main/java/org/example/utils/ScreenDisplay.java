package org.example.utils;

import org.example.ChipFlavor;
import org.example.DrinkFlavor;
import org.example.DrinkSize;
import org.example.Order;

public class ScreenDisplay {
    public static void displayHomeScreen() {
        System.out.println("""
                Welcome to Food Inspector Paradise!
                Please Enter One of The Following Options:
                1) New Order
                0) Exit
                """);
    }

    public static void displayOrderScreen() {
        System.out.println("""
                Hello! What Would You Like to Order?
                Please Enter One of The Following Options:
                1) Add Sandwich
                2) Add Drink
                3) Add Chips
                4) Checkout
                5) Cancel Order
                """);
    }

    public static void displaySandwichScreen() {
        System.out.println("""
                Hello! How would you like your sandwich?
                Please Enter One of The Following Options:
                1) Bread
                2) Toppings
                3) Would you like your sandwich toasted?
                """);
    }
    public static void displayCheckoutScreen(Order order) {
        System.out.println("Here's your order:");
        System.out.println(order);
        System.out.println("""
                
                1) Confirm
                2) Cancel
                """);
    }
    public static void displayDrinksScreen() {
        System.out.println("Here's our Drinks");
        for(DrinkFlavor flavor: DrinkFlavor.values()){
            System.out.println(flavor.ordinal()+1 + ") " +flavor.getName());
        }
    }

    public static void displaySizeScreen(){
        System.out.println("Here's our Sizes");
        for(DrinkSize size: DrinkSize.values()){
            System.out.println(size.ordinal()+1 + ") " + size);
        }
    }

    public static void displayChipsScreen() {
        System.out.println("Here's our Chips");
        for(ChipFlavor flavor: ChipFlavor.values()){
            System.out.println(flavor.ordinal()+1 + ") " +flavor.getName());
        }
    }
}