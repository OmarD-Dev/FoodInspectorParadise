package org.example.utils;

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
                0) Cancel Order
                """);
    }
}