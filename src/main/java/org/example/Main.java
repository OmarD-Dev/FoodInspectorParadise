package org.example;
import org.example.screens.*;
import org.example.utils.UserInput;
//import org.example.screens.HomeScreen;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HomeScreen homeScreen = new HomeScreen();
        UserInput userInput = new UserInput();
        homeScreen.startHomeScreen(userInput);
        homeScreen.closeUserInput();
    }
}