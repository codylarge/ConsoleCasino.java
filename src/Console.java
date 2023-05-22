public class Console
{
    public static void main(String[] args)
    {
        GameMaster gm = GameMaster.getInstance(); // Singleton class
        gm.runMainMenu();
    }

}
