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
                    toastSandwich();
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
                    addCheese();
                    break;
                case 3:
                    addOtherToppings();
                    break;
                case 4:
                    addSauces();
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

    public void toastSandwich(){
        System.out.print("\nWould you like to toast your sandwich? \n 1. Yes 2. No: ");
        int toastChoice = userInput.getMenuOption(menuOptions);
        if(toastChoice == 1){
            sandwich.setToasted(true);
            System.out.println("Your sandwich will be toasted.\n");
        }
        else{
            sandwich.setToasted(false);
            System.out.println("We will not toast your sandwich.\n");
        }
    }

    public void addMeats() {
        System.out.println("\nAdd Meats: ");
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
        System.out.println("Do you want extra " + topping + "? 1. Yes 2. No");
        int extraChoice = userInput.getMenuOption(new int[]{1, 2});
        if (extraChoice == 1) {
            return true;
        }
        return false;
    }

    public void addCheese(){
        System.out.println("\nAdd Cheese:");
        premiumToppings.displayCheese();
        int cheeseOption = userInput.getMenuOption(menuOptions);
        String selectedCheese = premiumToppings.getCheese(cheeseOption);
        if (selectedCheese != null && sandwich.getCheeseCounter() < 3) {
            System.out.println("You selected: " + selectedCheese);
            sandwich.addCheese(selectedCheese);
            if (askForExtraTopping(selectedCheese)) {
                sandwich.addCheese(selectedCheese);
            }
        } else if (sandwich.getCheeseCounter() >= 3) {
            System.out.println("That's too much cheese.");
        } else {
            System.out.println("Invalid Cheese option. Please choose again");
            addCheese();
        }
    }

    public void addOtherToppings(){
        System.out.println("\nAdd Other Toppings:");
        cheapToppings.displayRegToppings();
        int toppingOption = userInput.getMenuOption(menuOptions);
        String selectedTopping = cheapToppings.getRegTopping(toppingOption);
        if (selectedTopping != null && sandwich.getRegToppingCounter() < 3) {
            System.out.println("You selected: " + selectedTopping);
            sandwich.addCheapTopping(selectedTopping);
            if (askForExtraTopping(selectedTopping)) {
                sandwich.addCheapTopping(selectedTopping);
            }
        } else if (sandwich.getCheeseCounter() >= 3) {
            System.out.println("That's too much cheese.");
        } else {
            System.out.println("Invalid Cheese option. Please choose again");
            addCheese();
        }
    }

    public void addSauces(){
        System.out.println("\nAdd sauce: ");
        cheapToppings.displaySauces();
        int sauceOption = userInput.getMenuOption(menuOptions);
        String selectedSauce = cheapToppings.getSauces(sauceOption);
        if(selectedSauce !=null && sandwich.getSauceCounter() < 3){
            System.out.println("You selected " + selectedSauce);
            sandwich.addCheapTopping(selectedSauce);
            if(askForExtraTopping(selectedSauce)){
                sandwich.addCheapTopping(selectedSauce);
            }
        }else if(sandwich.getSauceCounter() >= 3){
            System.out.println("That's too much sauce.");
        }else{
            System.out.println("Invalid sauce option. Please choose again.");
            addSauces();
        }
    }


}
