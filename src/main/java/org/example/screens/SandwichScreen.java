package org.example.screens;

import org.example.*;
import org.example.utils.UserInput;

public class SandwichScreen {

    private Order order;
    Sandwich sandwich;
    private int[] menuOptions = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private OrderScreen back;
    private UserInput userInput;
    PremiumToppings premiumToppings = new PremiumToppings();
    CheapToppings cheapToppings = new CheapToppings();

    public SandwichScreen(OrderScreen back, UserInput userInput, Order order) {
        this.back = back;
        this.userInput = userInput;
        this.sandwich = new Sandwich();
        this.order = order;
    }
  
    public void startSandwichScreen() {
        System.out.println("""
                What bread would you like?
                1. Wheat
                2. White
                3. Rye
                4. Wrap
                 """);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        this.awaitSelect();
        this.getBreadSize();
        this.addToppings();
        this.customizeSandwich();
    }

    public void awaitSelect() {
        int option = userInput.getMenuOption(menuOptions);
        switch (option) {
            case 1:
                sandwich.setBreadType(BreadType.WHEAT);
                System.out.println("Wheat was selected\n");
                break;
            case 2:
                sandwich.setBreadType(BreadType.WHITE);
                System.out.println("White was selected\n");
                break;
            case 3:
                sandwich.setBreadType(BreadType.RYE);
                System.out.println("Rye was selected\n");
                break;
            case 4:
                sandwich.setBreadType(BreadType.WRAP);
                System.out.println("Wrap was selected\n");
                break;
            default:
                System.out.println("Something went wrong, please try again.");
                break;
        }
    }

    public void getBreadSize() {
        userInput.promptUser("""
        Pick a size: 
        1. 4 in. 
        2. 8 in. 
        3. 12 in.
        """);
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

    public void addToppingsPH() {
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
                System.out.println("+ Added Ham\n");
                break;
            case 3:
                sandwich.addMeat("Salami");
                System.out.println("+ Added Salami\n");
                break;
            case 4:
                sandwich.addMeat("Roast Beef");
                System.out.println("+ Added Roast Beef\n");
                break;
            case 5:
                sandwich.addMeat("Chicken");
                System.out.println("+ Added Chicken\n");
                break;
            case 6:
                sandwich.addMeat("Bacon");
                System.out.println("+ Added Bacon\n");
                break;
            case 7:
                System.out.println("No meat was added\n");
                break;

            default:
                System.out.println("Sorry, that is not a valid option.");
                break;
        }
    }

}

    public void customizeSandwich() {
        boolean continueCustomizing = true;
        while (continueCustomizing) {
            System.out.println("""
                    Customize your sandwich:
                     1. Add Toppings
                     2. Remove Toppings
                     3. Toast the Sandwich
                     4. Finish Customization
                    """);
            int customizationOption = userInput.getMenuOption(menuOptions);
            switch (customizationOption) {
                case 1:
                    addToppings();
                    break;
                case 2:
                    //removeToppings();
                    break;
                case 3:
                    //toastSandwich();
                    break;
                case 4:
                    continueCustomizing = false;
                    order.addOrderItem(sandwich);
                    back.startOrderScreen();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        }
    }

    public void addToppings() {
        boolean continueAddingToppings = true;
        while (continueAddingToppings) {
            System.out.println("""
                    Add Toppings:
                    1. Add Meats
                    2. Add Cheeses
                    3. Add Other Toppings
                    4. Add Sauces
                    5. Finish Adding Toppings
                    """);

            int categoryOption = userInput.getMenuOption(menuOptions);

            switch (categoryOption) {
                case 1:
                    addMeats();
                    break;
                case 2:
                    //addCheeses();
                    break;
                case 3:
                    //addOtherToppings();
                    break;
                case 4:
                    //addSauces();
                    break;
                case 5:
                    continueAddingToppings = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public void removeToppings() {
        System.out.println("Remove Toppings");
            /* Display toppings of sandwich - either with sandwich.displayTopping method
            or a new display method that takes in the sandwich gettoppings getter call.
            */
    }
    //public void toastSandwich(){}

    public void addMeats() {
        System.out.println("Add Meats:");
        premiumToppings.displayMeat();
        int meatOption = userInput.getMenuOption(menuOptions);
        String selectedMeat = premiumToppings.getMeat(meatOption);
        if (selectedMeat != null && sandwich.getMeatCounter() < 3) {
            System.out.println("You selected: " + selectedMeat);
            sandwich.addMeat(selectedMeat);
            if (askForExtraTopping(selectedMeat)) {
                sandwich.addMeat(selectedMeat);
            }
        } else if (sandwich.getMeatCounter() >= 3) {
            System.out.println("Too many extra proteins.");
        } else {
            System.out.println("Invalid meat option. Please choose again");
            addMeats();
        }


    }

    private boolean askForExtraTopping(String topping) {
        System.out.println(" Do you want extra " + topping + "? 1. Yes 2. No");
        int extraChoice = userInput.getMenuOption(new int[]{1, 2});
        if (extraChoice == 1) {
            return true;
        }
        return false;
    }
}