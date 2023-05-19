import enums.Cars;
import enums.Houses;
import utils.DataFile;
public class Main
{
    public static void main(String[] args)
    {
        DataFile df = new DataFile();
        df.updateDataField(Cars.CAR1);
        System.out.println("\n\n\n");
        System.out.println(df);
    }
}
