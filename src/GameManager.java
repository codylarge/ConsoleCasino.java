import utils.DataFile;
import utils.MenuManager;
import utils.SaveManager;

import java.util.Scanner;

public class GameManager
{
    DataFile gameData;
    SaveManager save;
    MenuManager menus;
    public GameManager()
    {
        menus = new MenuManager();
        startGame();
    }

    public void startGame() // MAIN MENU
    {
        int input = menus.mainMenu();
        if(input == 1) {
            this.save = new SaveManager(); // Play Option
            this.gameData = this.save.getDataFile();
            runGameMenu();
        } else if(input == 2) {
            System.out.println("How to play?");
        } else if(input == 3) {
            System.out.println("View saves");
        } else if(input == 4) {
            System.exit(0);
        }
    }

    public void runGameMenu() // GAME MENU
    {
        int input = menus.gameMenu();
        if(input == 1) { // HOME MENU 1: VIEW HOUSE 2: VIEW CAR 3: VIEW JOB 4: SAVE/EXIT 5: BACK
            runHome();
        } else if(input == 2) { // CASINO MENU

        } else if(input == 3) { // JOB MENU

        }

    }
     public void runCasino(int choice)
     {

     }
     public void runHome()
     {
         int input = menus.houseMenu();
         switch(input) // This is the option of the respective menu chosen. E.G. 1 if user chose 1st option of "Home" menu
         {
             case 1: // VIEW HOUSE
                 System.out.println("Your house: " + this.save.getDataFile().getData().getHouse() + "\n");
                 break;
             case 2: // VIEW CAR
                 System.out.println("View Car");
                 System.out.println("Your car: " + this.save.getDataFile().getData().getCar() + "\n");
                 break;
             case 3: // VIEW JOB
                 System.out.println("View Job");
                 System.out.println("Your job: " + this.save.getDataFile().getData().getJob() + "\n");
                 break;
             case 4: // SAVE/EXIT
                 System.out.println("Save/Exit");
                 save.saveToFile();
                 boolean exitOrNot = yesNoInput("Game saved, would you like to exit?");

                 if (exitOrNot) System.exit(0);
                 break;
             case 5: // BACK
                 System.out.println("Back");
                 runGameMenu();
         }
            runHome();
     }
     public void runJob(int choice)
     {

     }

     public boolean yesNoInput(String prompt) // return true if yes, false if no
     {
         Scanner sc = new Scanner(System.in);
         System.out.println(prompt + " (Y/N)");
         String input = sc.nextLine();

         if(input.toLowerCase().startsWith("y"))
         {
             return true;
         } else if(input.toLowerCase().startsWith("n"))
         {
             return false;
         } else {
             System.out.println("Invalid input, please try again");
             return yesNoInput(sc.nextLine());
         }
     }

}
