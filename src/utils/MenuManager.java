package utils;

import java.util.Scanner;

// This class builds menus for the game. It is completely static and therefore should NEVER be instantiated.
// Each method only prints the requested menu and returns a VALID user input
public class MenuManager
{
    static Scanner sc = new Scanner(System.in);
    private MenuManager() { throw new IllegalStateException("Utility class: " + this.getClass().toString() + " should not be instantiated. Call using MenuManager.method"); }

    public static int mainMenu()
    {
        int bounds [] = {1,4}; // CHANGE WHEN ADDING/REMOVING OPTIONS FROM MENU
        System.out.println("Welcome To ConsoleCasino! What would you like to do?");
        System.out.println("[1] Play game");
        System.out.println("[2] How to play?");
        System.out.println("[3] View saves");
        System.out.println("[4] Exit");
        int choice = sc.nextInt();
        if((choice >= bounds[0] && choice <= bounds[1]) || choice == 2534) // 2534 is a secret option used to manipulate data files (mainly for testing)
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
        System.out.println("[3] Upgrade Shop");
        int choice = sc.nextInt();
        if( choice >= bounds[0] && choice <= bounds[1])
        {
            clearConsole();
            return choice;
        } else {
            System.out.println("Invalid choice");
            return gameMenu();
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
        if( choice >= bounds[0] && choice <= bounds[1])
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
        if( choice >= bounds[0] && choice <= bounds[1])
        {
            clearConsole();
            return choice;
        } else {
            System.out.println("Invalid choice");
            return casinoMenu();
        }
    }

    public static int dataManagementMenu()
    {
        int bounds [] = {1,4}; // CHANGE WHEN ADDING/REMOVING OPTIONS FROM MENU
        System.out.println("Enter data to change [Money, Car, House]: ");
        System.out.println("[1] Money");
        System.out.println("[2] House");
        System.out.println("[3] Car");
        System.out.println("[4] Back");
        int choice = sc.nextInt();
        if( choice >= bounds[0] && choice <= bounds[1])
        {
            return choice;
        } else {
            System.out.println("Invalid choice");
            return dataManagementMenu();
        }
    }

    public static int upgradeShopMenu()
    {
        int bounds [] = {1,3}; // CHANGE WHEN ADDING/REMOVING OPTIONS FROM MENU
        System.out.println("Welcome to the upgrade shop. What would you like to upgrade?");
        System.out.println("[1] House");
        System.out.println("[2] Car");
        System.out.println("[3] Back");
        int choice = sc.nextInt();
        if( choice >= bounds[0] && choice <= bounds[1])
        {
            clearConsole();
            return choice;
        } else {
            System.out.println("Invalid choice");
            return upgradeShopMenu();
        }
    }

    public static void clearConsole() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }


}
