package org.example.screens;


import org.example.Order;
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
                    running = false;
                    break;
                default:
                    System.out.println("Something went wrong, please try again.");
                    break;
            }
        }


    }
    public static void displayOrderScreen() {
        System.out.println("""
                \nHello! What Would You Like to Order?
                
                Please Enter One of The Following Options:
                1. Add Sandwich
                2. Add Drink
                3. Add Chips
                4. Checkout
                5. Cancel Order
                """);
    }

}
