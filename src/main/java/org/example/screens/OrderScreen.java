package org.example.screens;


import org.example.Order;
import org.example.utils.ScreenDisplay;
import org.example.utils.UserInput;

public class OrderScreen {
    private Order order;
    private int[] menuOptions={0,1,2,3,4};
    private HomeScreen back;
    private UserInput userInput;

    public OrderScreen(HomeScreen back,UserInput userInput){
        this.back=back;
        this.userInput= userInput;
    }

    public void startOrderScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        ScreenDisplay.displayOrderScreen();
        this.awaitSelect();
    }
    public void awaitSelect(){
        int option= userInput.getMenuOption(menuOptions);
        switch (option){
            case 1:
                System.out.println("Let's build that sandwich!");
                SandwichScreen ss = new SandwichScreen(this,userInput, order);
                ss.startSandwichScreen();
                break;
            case 2:
                System.out.println("Time to Get Our Drink On");
                //DrinksScreen ds = new DrinksScreen(this,userInput);
                //ds.startDrinksScreen();
                break;
            case 3:
                System.out.println("Get your chips here");
                //ChipsScreen cs = new ChipsScreen(this,userInput);
               // cs.startChipsScreen();
                break;
            case 4:
                System.out.println("Show me the money!");
                CheckoutScreen cos = new CheckoutScreen(back,userInput);
                cos.startCheckoutScreen();
                break;
            case 5:
                System.out.println("On second thought...");
                back.startHomeScreen(userInput);
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
    //build function
    //await select function with the menu options
    // has the property of  new homescreen and takes it in to initialize -- that way we can go back and not waste memory

