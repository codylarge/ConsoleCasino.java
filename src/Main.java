import enums.Cars;
import enums.Houses;
import utils.DataFile;
import utils.SaveManager;

import java.io.File;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        SaveManager sm = new SaveManager();
        DataFile df = sm.getDataFile();
        System.out.println(df);
        df.updateDataField(1000);
        //.updateDataField("CAR1");
        //df.updateDataField("HOUSE2");
        df.updateDataField("JOB3");
        System.out.println("\n\n\n");
        System.out.println(df);
        sm.saveToFile();
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
