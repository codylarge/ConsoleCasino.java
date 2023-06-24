public class Console
{
    public static void main(String[] args)
    {
        GameManager gm = GameManager.getInstance(); // Singleton class
        gm.runMainMenu();
    }

}
