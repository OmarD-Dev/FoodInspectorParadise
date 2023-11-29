package org.example.screens;

import org.example.utils.UserInput;

public class SandwichScreen {


    private int[] menuOptions={0,1,2,3,4};
    private OrderScreen back;
    private UserInput userInput =  new UserInput();

    public SandwichScreen(OrderScreen back){
        this.back=back;
    }

    public void startOrderScreen(){
        System.out.println("""
                Hello! What Would You Like to Order?
                Please Enter One of The Following Options:
                1) Add Bread
                2) Add Toppings
                3) Add Chips
                0) Cancel Order
                """);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        this.awaitSelect();
    }
    public void awaitSelect(){
        int option= userInput.getMenuOption(menuOptions);
        switch (option){
            case 1:
                System.out.println("Let's build that sandwich!");
                break;
            case 2:
                System.out.println("Time to Get Our Drink On");
                break;
            case 3:
                System.out.println("Get your chips here");
                break;
            case 4:
                System.out.println("Show me the money!");
                break;
            case 5:
                System.out.println("On second thought...");
                break;
            default:
                System.out.println("Something went wrong, please try again.");
                break;
        }


    }

    public static class ChipsScreen {
        // start with a build function
        // takes in an orderscreen so that we can go back
        /* we could also merge this with drinks screen and have them just print out the options with an associate number
            then we can just match the number to whatever object it correlates to.

         */
    }
}
