package player_data.enums;

public enum Houses
{
    HOUSE0("Homeless", 0, "streets"),
    HOUSE1("Studio Apartment", 10000, "Ghetto"),
    HOUSE2("Condo", 40000, "Suburbs"),
    HOUSE3("House", 200000, "Suburbs"),
    HOUSE4("Penthouse", 300000, "City"),
    HOUSE5("Villa", 500000, "Italy"),
    HOUSE6("Mansion", 1000000, "Russia"),
    HOUSE7("Space Pod", 2000000, "Mars"); //Easter egg #3, must find elon musk to obtain house

    private final String name, location;
    private final int price;


    Houses(String name, int price, String location)
    {
        this.name = name;
        this.price = price;
        this.location = location;
    }

    public int getPrice()
    {
        return this.price;
    }
    public String getName()
    {
        return this.name;
    }
    public String getLocation()
    {
        return this.location;
    }
}
