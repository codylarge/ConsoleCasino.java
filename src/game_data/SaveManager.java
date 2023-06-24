package game_data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SaveManager
{
    DataFile df; // SaveManager will prompt user for datafile when created, must use SaveManager.getDataFile() to access df object in gameManager.
    public SaveManager()
    {
        this.df = new DataFile(selectSaveFile()); // When creating saveManager, prompt user for save file immediately.
    }

    /* GETTERS */
    public DataFile getDataFile()
    {
        return this.df;
    }

    public String getSaveFileData() // returns dataFile of current save
    {
        return(this.df.getData().toString());
    }

    public void saveToFile()
    { // Updates the file associated with this object's DataFile effectively saving the game.
        try (PrintWriter writer = new PrintWriter(this.df.getFile())) {
            for (String line : this.df.getFileLines()) {
                if (line.startsWith("money =")) {
                    writer.println("money = " + this.df.getData().getMoney());
                } else if (line.toLowerCase().startsWith("house")) {
                    writer.println("house = " + this.df.getData().getHouse().getTitle());
                } else if (line.toLowerCase().startsWith("car")) {
                    writer.println("car = " + this.df.getData().getCar().getTitle());
                } else {
                    writer.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    public File selectSaveFile() // Returns null if user wants to go back to main menu
    {
        Scanner userInput = new Scanner(System.in);
        String directoryPath = "saves";
        File directory = new File(directoryPath);

        // Ensure the directory exists and is a directory
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            System.out.println("Select a save: ");
            if (files != null) {
                int i = 0;
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".txt")) {
                        i++;
                        System.out.println("[" +i+ "]" + " " + file.getName());
                    }
                }
                System.out.println("[" +(++i)+ "]" + " Create new save");
                System.out.println("[" +(++i)+ "]" + " Exit");
                int choice = userInput.nextInt();

                /* INVALID CHOICE */
                if(choice < 1 ||  choice > files.length + 3)
                {
                    System.out.println("Invalid choice.");
                    return null;
                }

                /* EXIT */
                else if(choice == files.length + 2)
                {
                    System.exit(0);
                }

                /* CREATE NEW FILE */
                else if(choice == files.length + 1)
                {
                    DataFile defaultSave = getDefaultSave();
                    System.out.println("Enter a name for your save file: ");
                    String fileName = userInput.next();
                    File newSave = new File(directoryPath + "/" + fileName + ".txt");
                    try {
                        PrintWriter writer = new PrintWriter(newSave);
                        for(String s : defaultSave.getFileLines())
                        {
                            writer.println(s);
                        }

                        writer.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("File not found");
                    }
                    return newSave;
                }
                /* USE EXISTING SAVE */
                else
                {
                    File selectedSave = files[choice - 1]; // Creates file object of the selected save file
                    return selectedSave;
                }
                /* GO BACK */

            } else { // No files in directory
                System.out.println("No files found in the specified directory.");
            }
        } else { // Directory doesn't exist
            System.out.println("Invalid directory path.");
        }
        return null; // If no file is found, return null and handle it in calling method
    }

    public DataFile getDefaultSave()
    {
        DataFile defaultSave = new DataFile(new File ("assets/defaultdata.txt")); // change this path to math default data file path
        return defaultSave;
    }
}
