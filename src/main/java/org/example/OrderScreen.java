package org.example;

import org.example.utils.UserInput;

public class OrderScreen {

    private int[] menuOptions={0,1,2,3,4,};
    private HomeScreen back;
    private final UserInput userInput;

    public OrderScreen(HomeScreen back){
        this.back=back;
        this. userInput= new UserInput();
    }

    public void startOrderScreen(){
        System.out.println("""
                Hello! What Would You Like to Order?
                Please Enter One of The Following Options:
                1) Add Sandwich
                2) Add Drink
                3) Add Chips
                4) Checkout
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
}
    //build function
    //await select function with the menu options
    // has the property of  new homescreen and takes it in to initialize -- that way we can go back and not waste memory

