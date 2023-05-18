package enums;

public enum Cars
{
    CAR1("Car One", 100000, 40),
    CAR2("Car Two", 200000, 60),
    CAR3("Car Three", 300000, 80),
    CAR4("Car Four", 400000, 120),
    CAR5("Car Five", 500000, 150),
    CAR6("Car Six", 600000, 200);

    private String name;
    private int price, maxSpeed;

    Cars(String name, int price, int maxSpeed) {
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getMaxSpeed() {
        return maxSpeed + "mph";
    }

    public String toString()
    {
        return name + " Price: " + price + " Max speed: " + maxSpeed;
    }
}
