package interfaces;

import java.util.Scanner;

public interface EnumData<T>
{
    Scanner sc = new Scanner(System.in); // Scanner for user input within enum methods
    T exists(int index); // Checks if the enum exists
    String getName(); // ALl data objects will have a name corresponding to the word used in the file.


    String writeToFile(); // This method that when file is saved, the Data object is saved as CAR1, DEFAULTHOUSE, JOB3, etc. For easy reading.
    String toString();
    int getPrice();
    int getNumber();
    void listAll(int currentCar); // lists all cars above the current car
    int upgrade();
    void listALL(int current);
}

