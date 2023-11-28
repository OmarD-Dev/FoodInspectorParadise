package org.example.utils;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner= new Scanner(System.in);
    public static int getMenuOption(){
    int option = -1;
    boolean isValidOption= false;
    do{
        try {
            option= scanner.nextInt();
            isValidOption=true;
        }catch (Exception e){
            System.out.println("Invalid option. Please enter a valid number");
            scanner.nextLine();
        }
    }while(!isValidOption);
    scanner.close();
    return option;
    }
}
