package player_data.enums;

public enum Cars
{ // Max speed in MPH
    CAR0("Bike", 0, 20),
    CAR1("Golf Cart", 5000, 40),
    CAR2("Honda Civic", 20000, 70),
    CAR3("BMW M5", 50000, 90),
    CAR4("BMW M8", 100000, 120),
    CAR5("Ferrari 488 GTB", 200000, 160),
    CAR6("Lamborghini Huracán", 250000, 220),
    CAR7("Millennium Falcon", 0, 100000); // Easter egg #4, must find and beat Han Solo in poker game to obtain car

    private final String name;
    private final int price;
    private final int maxSpeed; // not final, might change with modification
    Cars(String name, int cost, int maxSpeed)
    {
        this.name = name;
        this.price = cost;
        this.maxSpeed = maxSpeed;
    }
    public int getPrice()
    {
        return this.price;
    }
    public String getName()
    {
        return this.name;
    }
    public int getMaxSpeed()
    {
        return this.maxSpeed;
    }
}
