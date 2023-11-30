package org.example.screens;

import org.example.BreadType;
import org.example.Order;
import org.example.Sandwich;
import org.example.utils.UserInput;

public class SandwichScreen {

    private Order order;
    Sandwich sandwich;
    private int[] menuOptions = {0, 1, 2, 3, 4};
    private OrderScreen back;
    private UserInput userInput;

    public SandwichScreen(OrderScreen back, UserInput userInput, Order order ) {
        this.back = back;
        this.userInput = userInput;
        this.sandwich= new Sandwich();
        this.order=order;
    }

    public void startSandwichScreen() {
        System.out.println("""
                What bread would you like?
                1.Wheat
                2.White
                3.rye
                4.wrap
                 """);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        this.awaitSelect();
        this.getBreadSize();
        this.addToppings();

    }

    public void awaitSelect() {
        int option = userInput.getMenuOption(menuOptions);
        switch (option) {
            case 1:
                sandwich.setBreadType(BreadType.WHEAT);
                break;
            case 2:
                sandwich.setBreadType(BreadType.WHITE);
                break;
            case 3:
                sandwich.setBreadType(BreadType.RYE);
                break;
            case 4:
                sandwich.setBreadType(BreadType.WRAP);
                break;
            default:
                System.out.println("Something went wrong, please try again.");
                break;
        }
    }
    public void getBreadSize() {
        userInput.promptUser("Pick a size: 1) 4 in. 2) 8 in. 3)12 in");
        int option = userInput.getMenuOption(menuOptions);
        switch (option) {
            case 1:
                sandwich.setSize(4);
                break;
            case 2:
                sandwich.setSize(8);
                break;
            case 3:
                sandwich.setSize(12);
                break;
            default:
                System.out.println("Sorry, that size is not available.");
                break;
        }
    }
    public void addToppings() {
        userInput.promptUser("""
                Pick a meat option:
                1. Steak
                2. Ham
                3. Salami
                4. Roast Beef
                5. Chicken
                6. Bacon
                7. No meat
                
                
                """);
        int option = userInput.getMenuOption(menuOptions);
        switch (option) {
            case 1:
                sandwich.addMeat("Steak");
                order.addOrderItem(sandwich);
                back.startOrderScreen();
                break;
            case 2:
                sandwich.addMeat("Ham");
                break;
            case 3:
                sandwich.addMeat("Salami");
                break;
            case 4:
                sandwich.addMeat("Roast Beef");
                break;
            case 5:
                sandwich.addMeat("Chicken");
                break;
            case 6:
                sandwich.addMeat("Bacon");
                break;
            case 7:

                break;

            default:
                System.out.println("Sorry, that is not a valid option.");
                break;
        }
    }

}
