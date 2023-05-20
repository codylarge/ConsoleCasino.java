package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SaveManager
{
    DataFile df;
    public SaveManager()
    {
        this.df = new DataFile(selectSaveFile());
    }

    public DataFile getDataFile()
    {
        return this.df;
    }
    public File selectSaveFile()
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
                File selectedSave = files[userInput.nextInt() - 1]; // Creates file object of the selected save file
                return selectedSave;
            } else {
                System.out.println("No files found in the specified directory.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
        return null; // If no file is found, return null and handle it in calling method
    }

    public void saveToFile()
    { // Updates the file associated with this object with the data in the DataFields object
        try (PrintWriter writer = new PrintWriter(this.df.getFile())) {
            for (String line : this.df.getFileLines()) {
                if (line.startsWith("money =")) {
                    writer.println("money = " + this.df.getData().getMoney());
                } else if (line.toLowerCase().startsWith("house")) {
                    writer.println("house = " + this.df.getData().getHouse().writeToFile());
                } else if (line.toLowerCase().startsWith("car")) {
                    writer.println("car = " + this.df.getData().getCar().writeToFile());
                } else if (line.toLowerCase().startsWith("job")) {
                    writer.println("job = " + this.df.getData().getJob().writeToFile());
                } else {
                    writer.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
