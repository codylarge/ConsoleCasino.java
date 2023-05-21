package utils;

import java.util.Scanner;

// This class builds menus for the game. It is all void methods, it just runs through the requested menu returns the choice
// This prevents the MenuManager class from needing access to any data.
public class MenuManager
{
    Scanner sc;
    public MenuManager()
    {
        sc = new Scanner(System.in);
    }

    public int mainMenu()
    {
        System.out.println("Welcome To ConsoleCasino! What would you like to do?");
        System.out.println("[1] Play game");
        System.out.println("[2] How to play?");
        System.out.println("[3] View saves");
        System.out.println("[4] Exit");
        int choice = sc.nextInt();
        clearConsole();
        if(choice > 4 || choice < 1)
        {
                System.out.println("Invalid choice");
                mainMenu();
        }
        return choice;
    }

    public int gameMenu() // This is the menu the user goes to directly after selecting save, calls respective menu's directly as no data is needed
    {
        System.out.println("Where would you like to go?");
        System.out.println("[1] Home");
        System.out.println("[2] Casino");
        System.out.println("[3] Job");
        int choice = sc.nextInt();
        clearConsole();
        if(choice > 3 || choice < 1)
        {
            System.out.println("Invalid choice");
            gameMenu();
        }
        return choice;
    }

    public int jobMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("[1] Work");
        System.out.println("[2] View job description");
        System.out.println("[3] Ask for a raise");
        System.out.println("[4] Back");
        int choice = sc.nextInt();
        if(choice > 4 || choice < 1)
        {
            System.out.println("Invalid choice");
            mainMenu();
        }
        return choice;
    }

    public int houseMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("[1] View house");
        System.out.println("[2] View car");
        System.out.println("[3] View job");
        System.out.println("[4] Save/Exit game");
        System.out.println("[5] Back");
        int choice = sc.nextInt();
        if(choice > 5 || choice < 1)
        {
            System.out.println("Invalid choice");
            mainMenu();
        }
        return choice;
    }

    public int casinoMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("[1] Blackjack");
        System.out.println("[2] Roulette");
        System.out.println("[3] Coin-flips");
        System.out.println("[4] View prizes");
        System.out.println("[5] Back");
        int choice = sc.nextInt();
        if(choice > 5 || choice < 1)
        {
            System.out.println("Invalid choice");
            mainMenu();
        }
        return choice;
    }

    public static void clearConsole() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
}