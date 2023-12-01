package org.example.screens;

import org.example.utils.UserInput;
import org.example.utils.ScreenDisplay;

public class HomeScreen {

    private final int[] menuOptions = {0, 1};
    private UserInput userInput;

    public void startHomeScreen(UserInput userInput) {
        this.userInput = userInput;

        boolean running = true;
        while (running) {
            ScreenDisplay.displayHomeScreen();
            int option = this.userInput.getUserInput();
            switch (option) {
                case 1:
                    System.out.println("To the order screen!");
                    OrderScreen os = new OrderScreen(this.userInput);
                    os.startOrderScreen();
                    break;
                case 0:
                    System.out.println("Exiting the application");
                    running= false;
                    break;
                default:
                    System.out.println("Something went wrong, please try again.");
                    break;
            }
        }
    }

}