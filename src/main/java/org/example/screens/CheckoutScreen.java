package org.example;

import org.example.screens.HomeScreen;
import org.example.screens.OrderScreen;
import org.example.utils.ScreenDisplay;
import org.example.utils.UserInput;

public class CheckoutScreen {
    private int[]menuOptions= {0,1};
    private HomeScreen back;
    private UserInput userInput;

    public CheckoutScreen(HomeScreen back, UserInput userInput){
        this.back=back;
        this.userInput=userInput;
    }

    public void startCheckoutScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        ScreenDisplay.displayCheckoutScreen();
        this.awaitSelect();
    }

    public void awaitSelect() {
        int option = userInput.getMenuOption(menuOptions);
        switch (option) {
            case 1:
                System.out.println("Order Confirmed");

                break;
            case 2:
                System.out.println("Order Cancelled");
                back.startHomeScreen(userInput);
                break;
            default:
                System.out.println("Something went wrong, please try again.");
                break;
        }
    }
}