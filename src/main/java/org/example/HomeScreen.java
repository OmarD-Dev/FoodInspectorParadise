package org.example;

import org.example.utils.UserInput;
import org.example.utils.ScreenDisplay;

public class HomeScreen {
    private final int[] menuOptions = {0, 1};
    private final UserInput userInput = new UserInput();

    public void startHomeScreen() {
        ScreenDisplay.displayHomeScreen();
        this.awaitSelect();
    }

    public void awaitSelect() {
        int option = userInput.getMenuOption(menuOptions);
        switch (option) {
            case 1:
                System.out.println("To the order screen!");
                OrderScreen os = new OrderScreen(this);
                os.startOrderScreen();
                break;
            case 0:
                System.out.println("Exiting the application");
                break;
            default:
                System.out.println("Something went wrong, please try again.");
                break;
        }
    }

    public void closeUserInput() {
        userInput.closeScanner();
    }
}