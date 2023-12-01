package org.example.screens;

import org.example.utils.UserInput;

public class HomeScreen {
    private UserInput userInput;

    public void startHomeScreen(UserInput userInput) {
        this.userInput = userInput;

        boolean running = true;
        while (running) {
            displayHomeScreen();
            int option = this.userInput.getUserInput();
            switch (option) {
                case 0:
                    System.out.println("Exiting the application");
                    running= false;
                    break;
                case 1:
                    System.out.println("To the order screen!");
                    OrderScreen os = new OrderScreen(this.userInput);
                    os.startOrderScreen();
                    break;
                default:
                    System.out.println("Something went wrong, please try again.");
                    running= false;
                    break;
            }
        }
    }
    public static void displayHomeScreen() {
        System.out.println("""
                \nWelcome to Food Inspector Paradise!
                
                Please Enter One of The Following Options:
                1. New Order
                0. Exit
                """);
    }

}