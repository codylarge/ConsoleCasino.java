package enums;
//test

import interfaces.PlayerData;

public enum Cars implements PlayerData
{
    DEFAULTCAR("Bike", 0, 25),
    CAR1("Golf Cart", 25000, 40),
    CAR2("Honda Civic", 100000, 60),
    CAR3("BMW M5", 200000, 80),
    CAR4("BMW M8", 300000, 120),
    CAR5("Ferrari 488 GTB", 500000, 150),
    CAR6("Lamborghini Huracán", 750000, 200);

    private String name;
    private int price, maxSpeed;

    Cars(String name, int price, int maxSpeed) {
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }



    public int getPrice() {
        return price;
    }

    public String getMaxSpeed() {
        return maxSpeed + "mph";
    }

    @Override
    public String writeToFile()
    {
        return this.name();
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String toString()
    {
        return name + ", Price: " + price + ", Max speed: " + maxSpeed;
    }
}
