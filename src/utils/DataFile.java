package utils;
import enums.Cars;
import enums.Houses;
import enums.Jobs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
        this.data = new DataFields();
        initializeDataFields();
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

    public void initializeDataFields()
    {
        for (String line : fileLines) {
             String[] split = line.split("=");
            if (line.startsWith("money =")) {
                if(split.length > 1) {
                    this.data.setMoney(Integer.parseInt(split[1].trim()));
                } else {
                    this.data.setMoney(0);
                }
            } else if (line.toLowerCase().startsWith("house")) {
                if(split.length > 1 && !split[1].contains("null")) {
                    this.data.setHouse(split[1].trim());
                } else {
                    this.data.setHouse("DEFAULT");
                }
            } else if (line.toLowerCase().startsWith("car")) {
                if(split.length > 1 && !split[1].contains("null")) {
                    this.data.setCar(split[1].trim());
                } else {
                    this.data.setCar("DEFAULT");
                }
            } else if (line.toLowerCase().startsWith("job")) {
                if(split.length > 1 && !split[1].contains("null")) {
                    this.data.setJob(split[1].trim());
                } else {
                    this.data.setJob("DEFAULT");
                }
            }
        }
    }

    public void updateData(int money) // Updates stored value (not file) of money field
    {
        data.setMoney(money);
    }
    public void updateDataField(Enum field) // Updates stored value (not file) of money field
    {
        if(field instanceof Cars)
        {
            data.setCar(field.toString());
        }
        else if(field instanceof Houses)
        {
            data.setHouse(field.toString());
        }
        else if(field instanceof Jobs)
        {
            data.setJob(field.toString());
        }
    }

    public void updateFile() {
        try (PrintWriter writer = new PrintWriter(file)) {
            for (String line : fileLines) {
                if (line.startsWith("money =")) {
                    writer.println("money = " + data.getMoney());
                } else if (line.toLowerCase().startsWith("house")) {
                    writer.println("house = " + data.getHouse());
                } else if (line.toLowerCase().startsWith("car")) {
                    writer.println("car = " + data.getCar());
                } else if (line.toLowerCase().startsWith("job")) {
                    writer.println("job = " + data.getJob());
                } else {
                    writer.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    public String toString()
    {
        return this.printFile() + "\nData: \n" + this.data;
    }
}
