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

// The DataFile class is the main data class in this program, It stores the DataFields object which contains quick access data such as money and character items (car, house, job)
// It also contains the file being used in the program and has the ability to update the file with values stored its DataFields object (Whenever user saves)
// Upon creation, it immediately fills The DataFields variables money, car, house, and job with the values from the file.
public class DataFile
{
    private File file;
    private List<String> fileLines;
    private DataFields data;


    /* FILE METHODS */
    public DataFile(File file)
    {
        this.file = file;
        readFile();
        this.data = new DataFields();
        initializeDataFields();
    }

    public DataFields getData()
    {
        return data;
    }
    public List<String> getFileLines()
    {
        return fileLines;
    }
    public File getFile()
    {
        return file;
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


    /* DATAFIELD METHODS */
    public void initializeDataFields()
    { //initialize data fields from file and enters them into the DataFile object's data
        for (String line : fileLines) {
             String[] split = line.split("=");
            if (line.startsWith("money =")) {
                if(split.length > 1) {
                    this.updateDataField(Integer.parseInt(split[1].trim()));
                } else {
                    this.updateDataField(0);
                }
            } else if (line.toLowerCase().startsWith("house")) { // TODO:remove duplicate code in if statements
                if(split.length > 1 && !split[1].contains("null")) {
                    this.updateDataField(split[1].trim());
                } else {
                    this.updateDataField("DEFAULTHOUSE");
                }
            } else if (line.toLowerCase().startsWith("car")) {
                if(split.length > 1 && !split[1].contains("null")) {
                    this.updateDataField(split[1].trim());
                } else {
                    this.updateDataField("DEFAULTCAR");
                }
            } else if (line.toLowerCase().startsWith("job")) {
                if(split.length > 1 && !split[1].contains("null")) {
                    this.updateDataField(split[1].trim());
                } else {
                    this.updateDataField("DEFAULTJOB");
                }
            }
        }
    }
    public void updateDataField(int money) // Updates stored value (not file) of money field
    {
        this.data.setMoney(money);
    }
    public void updateDataField(String field) // Updates stored value (not file) of money field
    {
        String uc = field.toUpperCase();
        if(uc.contains("CAR"))
        {
            this.data.setCar(uc);
        }
        else if(uc.contains("HOUSE"))
        {
            this.data.setHouse(uc);
        }
        else if(uc.contains("JOB"))
        {
            this.data.setJob(uc);
        }
        else
        {
            throw new IllegalArgumentException("Field not found: " + field);
        }
    }

    public String toString()
    {
        return this.printFile() + "\nData: \n" + this.data;
    }
}
