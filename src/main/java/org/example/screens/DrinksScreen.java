package org.example.screens;

import org.example.Drinks;
import org.example.Order;
import org.example.utils.ScreenDisplay;
import org.example.utils.UserInput;

public class DrinksScreen {
    private Drinks drinksMenu = new Drinks();
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
        this.awaitSelect();
    }
    public void awaitSelect() {
        int option = userInput.getMenuOption(menuOptions);
        String selectedDrink = drinksMenu.getDrink(option - 1);
        if (selectedDrink != null) {
            order.addOrderItem(new Drinks());
        } else {
            System.out.println("Invalid selection");
        }
    }



    // the same as chips screen
    // can be merged according to the idea I put in chipsScreen
}
