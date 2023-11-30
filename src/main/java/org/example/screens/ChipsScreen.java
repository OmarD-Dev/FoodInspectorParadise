package org.example.screens;

import org.example.Order;
import org.example.utils.ScreenDisplay;
import org.example.utils.UserInput;

public class ChipsScreen {
    // start with a build function
    // takes in an orderscreen so that we can go back
        /* we could also merge this with drinks screen and have them just print out the options with an associate number
            then we can just match the number to whatever object it correlates to.
        */
    private Order order;
    private int[] menuOptions={1,2,3,4,9};
    private OrderScreen back;
    private UserInput userInput;
    public ChipsScreen(OrderScreen back, UserInput userInput,Order order) {
        this.back = back;
        this.order=order;
        this.userInput=userInput;
    }

    public void startChipsScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        ScreenDisplay.displayChipsScreen();
        //this.awaitSelect();
    }
   /* public void awaitSelect() {
        int option = userInput.getMenuOption(menuOptions);
        switch (option) {
            case 0:
                order.addOrderItem(c);
                // I'm not tryna figure out the enums rn its frying my brain so I'm goint o just do the drinks class first
                break;
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 9:
                break;


            default:
                System.out.println("Something went wrong, please try again.");
                break;
        }
    }
    // the same as chips screen
    // can be merged according to the idea I put in chipsScreen

    */
}

