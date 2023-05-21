package interfaces;

// All enums that represent player data will implement this interface.
public interface PlayerData
{
    public String getName(); // ALl data objects will have a name corresponding to the word used in the file.
    public String writeToFile(); // This method that when file is saved, the Data object is saved as CAR1, DEFAULTHOUSE, JOB3, etc. For easy reading.
    public String toString();
}
