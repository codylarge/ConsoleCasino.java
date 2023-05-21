package utils;

import java.util.Scanner;

// This class builds menus for the game. It is completely static and therefore should NEVER be instantiated.
// Each method only prints the requested menu and returns a VALID user input
public class MenuManager
{
    static Scanner sc = new Scanner(System.in);
    private MenuManager() { throw new IllegalStateException("Utility class: " + this.getClass().toString() + " should not be instantiated"); }

    public static int mainMenu()
    {
        int bounds [] = {1,4}; // CHANGE WHEN ADDING/REMOVING OPTIONS FROM MENU
        System.out.println("Welcome To ConsoleCasino! What would you like to do?");
        System.out.println("[1] Play game");
        System.out.println("[2] How to play?");
        System.out.println("[3] View saves");
        System.out.println("[4] Exit");
        int choice = sc.nextInt();
        if( !(choice < bounds[0]) && !(choice > bounds[1])) // Kinda sloppy but it must be checked for IN bounds BEFORE outbounds for the recursion to work
        {
            clearConsole();
            return choice;
        } else {
            System.out.println("Invalid choice");
            return mainMenu();
        }
    }

    public static int gameMenu() // This is the menu the user goes to directly after selecting save, calls respective menu's directly as no data is needed
    {
        int bounds [] = {1,3}; // CHANGE WHEN ADDING/REMOVING OPTIONS FROM MENU
        System.out.println("Where would you like to go?");
        System.out.println("[1] Home");
        System.out.println("[2] Casino");
        System.out.println("[3] Job");
        int choice = sc.nextInt();
        if( !(choice < bounds[0]) && !(choice > bounds[1]))
        {
            clearConsole();
            return choice;
        } else {
            System.out.println("Invalid choice");
            return gameMenu();
        }
    }

    public static int jobMenu()
    {
        int bounds [] = {1,4}; // CHANGE WHEN ADDING/REMOVING OPTIONS FROM MENU
        System.out.println("What would you like to do?");
        System.out.println("[1] Work");
        System.out.println("[2] View job description");
        System.out.println("[3] Ask for a raise");
        System.out.println("[4] Back");
        int choice = sc.nextInt();
        if( !(choice < bounds[0]) && !(choice > bounds[1]))
        {
            clearConsole();
            return choice;
        } else {
            System.out.println("Invalid choice");
            return jobMenu();
        }
    }

    public static int houseMenu()
    {
        int bounds [] = {1,4}; // CHANGE WHEN ADDING/REMOVING OPTIONS FROM MENU
        System.out.println("What would you like to do?");
        System.out.println("[1] View house");
        System.out.println("[2] View car");
        System.out.println("[3] Save/Exit game");
        System.out.println("[4] Back");
        int choice = sc.nextInt();
        if( !(choice < bounds[0]) && !(choice > bounds[1]))
        {
            clearConsole();
            return choice;
        } else {
            System.out.println("Invalid choice");
            return houseMenu();
        }
    }

    public static int casinoMenu()
    {
        int bounds [] = {1,5}; // CHANGE WHEN ADDING/REMOVING OPTIONS FROM MENU
        System.out.println("What would you like to do?");
        System.out.println("[1] Blackjack");
        System.out.println("[2] Roulette");
        System.out.println("[3] Coin-flips");
        System.out.println("[4] View prizes");
        System.out.println("[5] Back");
        int choice = sc.nextInt();
        if( !(choice < bounds[0]) && !(choice > bounds[1]))
        {
            clearConsole();
            return choice;
        } else {
            System.out.println("Invalid choice");
            return casinoMenu();
        }
    }

    public static void clearConsole() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
}
