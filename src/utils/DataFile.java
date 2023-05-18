package utils;
import enums.Cars;
import enums.Houses;
import enums.Jobs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DataFile {
    private File file;
    private List<String> fileLines;
    private DataFields data;


    public DataFile()
    {
        this("src/data.txt");
    }
    public DataFile(String filename) {
        file = new File(filename);
        readFile();
    }

    private void readFile() {
        fileLines = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                fileLines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public String printFile() {
        StringBuilder fileString = new StringBuilder();
        for (String line : fileLines) {
            fileString.append(line).append("\n");
        }
        return fileString.toString();
    }
    public void updateData(int money) // Updates stored value (not file) of money field
    {
        data.setMoney(money);
    }
    public void updateData(Enum field) {
        for (String line : fileLines) {
            if (field instanceof Houses && line.startsWith("house")) {
                String[] parts = line.split("=");
                data.setHouse(parts[1].trim());
            } else if (field instanceof Cars && line.startsWith("car")) {
                String[] parts = line.split("=");
                data.setCar(parts[1].trim());
            } else if (field instanceof Jobs && line.startsWith("job")) {
                String[] parts = line.split("=");
                data.setJob(parts[1].trim());
            }
        }
    }

    public String toString()
    {
        return this.printFile() + "Data: " + this.data;
    }
}
