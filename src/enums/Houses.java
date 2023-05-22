package enums;

import interfaces.PlayerData;

public enum Houses implements PlayerData
{
    DEFAULTHOUSE("Homeless", 0, ""),
    HOUSE1("Studio Apartment", 100000, "Boondocks"),
    HOUSE2("Condo", 200000, "City"),
    HOUSE3("House", 400000, "Country"),
    HOUSE4("Penthouse", 500000, "City Center"),
    HOUSE5("Villa", 750000, "Italy"),
    HOUSE6("Mansion", 1000000, "Russia");

    private String name;
    private int price;
    private String location;

    Houses(String name, int price, String location) {
        this.name = name;
        this.price = price;
        this.location = location;
    }
    public int getPrice() {
        return price;
    }
    public String getLocation() {
        return location;
    }

    public int getHouseNumber()
    {
        return this.ordinal();
    }

    public void listAll(int currentHouse)
    {
        int i = currentHouse + 1;
        for (Houses house : Houses.values()) {
            if (house.ordinal() > currentHouse) {
                System.out.println("[" + i + "]" + house);
                i++;
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String writeToFile()
    {
        return this.name();
    }

    @Override
    public String toString()
    {
        return this.name + ", Price: " + this.price + ", Location: " + this.location;
    }
}
