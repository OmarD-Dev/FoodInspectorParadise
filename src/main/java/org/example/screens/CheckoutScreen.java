package org.example.screens;

import org.example.Order;
import org.example.Receipt;
import org.example.utils.ScreenDisplay;
import org.example.utils.UserInput;

public class CheckoutScreen {
    private Order order;
    private int[] menuOptions= {1,2};

    private UserInput userInput;

    public CheckoutScreen( UserInput userInput, Order order){
        this.userInput=userInput;
        this.order= order;
    }

    public void startCheckoutScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        displayCheckoutScreen(order);
        this.awaitSelect();
    }

    public void awaitSelect() {
        int option = userInput.getMenuOption(menuOptions);
        switch (option) {
            case 1:
                System.out.println("Order Confirmed!");
                Receipt.generateReceipt(order);
                System.exit(0);
                break;
            case 2:
                System.out.println("Order Cancelled");
                System.exit(0);
                break;
            default:
                System.out.println("Something went wrong, please try again.");
                break;
        }
    }
    public static void displayCheckoutScreen(Order order) {
        System.out.println("Here's your order:");
        System.out.println(order);
        System.out.println("""
                
                1) Confirm
                2) Cancel
                """);
    }
}