package org.example.screens;

import org.example.ChipFlavor;
import org.example.Chips;
import org.example.Order;
import org.example.utils.UserInput;

public class ChipsScreen {
    private Order order;

    private UserInput userInput;
    public ChipsScreen( UserInput userInput,Order order) {
        this.order=order;
        this.userInput=userInput;
    }

    public void startChipsScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        displayChipsScreen();
        int choice = userInput.getUserInput();
        Chips chip = new Chips(ChipFlavor.values()[choice -1]);
        order.addOrderItem(chip);
    }
    public static void displayChipsScreen() {
        System.out.println("\nHere's our Chips:");
        for(ChipFlavor flavor: ChipFlavor.values()){
            System.out.println(flavor.ordinal()+1 + ". " +flavor.getName());
        }
    }

}

