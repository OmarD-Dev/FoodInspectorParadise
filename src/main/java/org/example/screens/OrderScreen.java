package org.example.screens;


import org.example.Order;
import org.example.utils.ScreenDisplay;
import org.example.utils.UserInput;

public class OrderScreen {
    private Order order;

    private UserInput userInput;

    public OrderScreen(UserInput userInput){
        this.userInput= userInput;
        this.order= new Order();
    }

    public void startOrderScreen(){
        boolean running= true;
        while (running) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            displayOrderScreen();
            int option = userInput.getUserInput();
            switch (option) {
                case 1:
                    System.out.println("Let's build that sandwich!");
                    SandwichScreen ss = new SandwichScreen(userInput, order);
                    ss.startSandwichScreen();
                    break;
                case 2:
                    System.out.println("Time to Get Our Drink On");
                    DrinksScreen ds = new DrinksScreen(userInput, order);
                    ds.startDrinksScreen();
                    break;
                case 3:
                    System.out.println("Get your chips here");
                    ChipsScreen cs = new ChipsScreen(userInput, order);
                    cs.startChipsScreen();
                    break;
                case 4:
                    System.out.println("Show me the money!");
                    CheckoutScreen cos = new CheckoutScreen(userInput, order);
                    cos.startCheckoutScreen();
                    break;
                case 5:
                    System.out.println("On second thought...");
                    running=false;
                    // need to figure out if we close scanner here or not.
                    // this is especially tricky becuase whatever we put here would affect the start of the program
                    // I think the right thing to do is to add a scanner input to the homescreen and have it initialized in main
                    // that way we can just pass the scanner here again
                    break;
                default:
                    System.out.println("Something went wrong, please try again.");
                    break;
            }
        }


    }
    public static void displayOrderScreen() {
        System.out.println("""
                Hello! What Would You Like to Order?
                Please Enter One of The Following Options:
                1) Add Sandwich
                2) Add Drink
                3) Add Chips
                4) Checkout
                5) Cancel Order
                """);
    }

}
    //build function
    //await select function with the menu options
    // has the property of  new homescreen and takes it in to initialize -- that way we can go back and not waste memory

