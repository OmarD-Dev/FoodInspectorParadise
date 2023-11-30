package org.example.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    private final Scanner scanner;

    public UserInput(){
        this.scanner= new Scanner(System.in);
    }

    public int getMenuOption(int[] menuOptions){
    int option = -1;
    boolean isValid= false;
    while (!isValid){
        try{
            option = scanner.nextInt();
            isValid= isValidOption(option,menuOptions);
        }catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter an available option.");
        }finally {
            scanner.nextLine();
        }
    }

    return option;
    }
    public boolean isValidOption(int userOption, int []menuOptions ){
        for(int option: menuOptions){
            if(userOption == option){
                return true;
            }
        }
        System.out.println("Not an option sorry !");
        return false;
    }

    public void closeScanner() {
        scanner.close();
    }

    public void promptUser(String prompt){
        System.out.println(prompt + "\n");
    }
    public char getCharInput() {
        String userInput = scanner.nextLine().toUpperCase().trim();
        if (!userInput.isEmpty()) {
            return userInput.charAt(0);
        } else {
            return getCharInput();
        }
    }

}
