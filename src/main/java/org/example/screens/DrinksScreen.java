package org.example.screens;

import org.example.*;
import org.example.utils.UserInput;

public class DrinksScreen {
    private Order order;
    private UserInput userInput;
    public DrinksScreen(UserInput userInput, Order order) {
        this.order=order;
        this.userInput=userInput;
    }
    public void startDrinksScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        displayDrinksScreen();
        int choice = userInput.getUserInput();
        displaySizeScreen();
        int sizeChoice= userInput.getUserInput();
        Drink drink = new Drink(DrinkFlavor.values()[choice -1],DrinkSize.values()[sizeChoice-1]);
        order.addOrderItem(drink);
    }
    public static void displayDrinksScreen() {
        System.out.println("\nHere's our Drinks: ");
        for(DrinkFlavor flavor: DrinkFlavor.values()){
            System.out.println(flavor.ordinal()+1 + ". " +flavor.getName());
        }
    }
    public static void displaySizeScreen(){
        System.out.println("\nHere's our Sizes: ");
        for(DrinkSize size: DrinkSize.values()){
            System.out.println(size.ordinal()+1 + ". " + size);
        }
    }
}
