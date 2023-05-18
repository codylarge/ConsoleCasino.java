package enums;

public enum Houses {
    HOUSE1("House One", 100000, "Location One"),
    HOUSE2("House Two", 200000, "Location Two"),
    HOUSE3("House Three", 300000, "Location Three"),
    HOUSE4("House Four", 400000, "Location Four"),
    HOUSE5("House Five", 500000, "Location Five"),
    HOUSE6("House Six", 600000, "Location Six");

    private String name;
    private int price;
    private String location;

    Houses(String name, int price, String location) {
        this.name = name;
        this.price = price;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getLocation() {
        return location;
    }

    public String toString()
    {
        return this.name + " Price: " + this.price + " Location: " + this.location;
    }
}
