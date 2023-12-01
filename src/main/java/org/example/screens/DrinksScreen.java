package org.example.screens;

import org.example.*;
import org.example.utils.ScreenDisplay;
import org.example.utils.UserInput;

public class DrinksScreen {
    private Order order;
    private int[] menuOptions={0,1,2,3,4,5,6};
    private UserInput userInput;
    public DrinksScreen(UserInput userInput, Order order) {
        this.order=order;
        this.userInput=userInput;
    }
    public void startDrinksScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        ScreenDisplay.displayDrinksScreen();
        int choice = userInput.getUserInput();
        ScreenDisplay.displaySizeScreen();
        int sizeChoice= userInput.getUserInput();
        Drink drink = new Drink(DrinkFlavor.values()[choice -1],DrinkSize.values()[sizeChoice-1]);
        order.addOrderItem(drink);
    }




    // the same as chips screen
    // can be merged according to the idea I put in chipsScreen
}
