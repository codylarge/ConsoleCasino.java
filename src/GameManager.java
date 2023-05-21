import utils.DataFile;
import utils.MenuManager;
import utils.SaveManager;

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
            enterGame();
        } else if(input == 2) {
            System.out.println("How to play?");
        } else if(input == 3) {
            System.out.println("View saves");
        } else if(input == 4) {
            System.exit(0);
        }
    }

    public void enterGame() // GAME MENU
    {
        int[] input = menus.gameMenu();
        if(input[0] == 1) {
            System.out.println("Home");
        } else if(input[0] == 2) {
            System.out.println("Casino");
        } else if(input[0] == 3) {
            System.out.println("Job");
        }
    }


}
