import enums.Cars;
import enums.Houses;
import utils.DataFile;

import java.io.File;

public class Main
{
    public static void main(String[] args)
    {
        String directoryPath = "saves";
        File directory = new File(directoryPath);

        // Ensure the directory exists and is a directory
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".txt")) {
                        System.out.println(file.getName());
                    }
                }
            } else {
                System.out.println("No files found in the specified directory.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }


        /*
        DataFile df = new DataFile();
        df.updateDataField(1000);
        df.updateDataField("CAR3");
        df.updateDataField("HOUSE4");
        df.updateDataField("JOB7");
        System.out.println("\n\n\n");
        System.out.println(df);
        df.updateFile();
         */
}
