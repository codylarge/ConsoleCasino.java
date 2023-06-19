package player_data.enums;
//test

import interfaces.EnumData;

public enum Cars implements EnumData<Cars> // TODO: Transform into class with parent enum data. leave this enum with ONLY constants to be read by associated class
{ // Max speed in MPH
    DEFAULTCAR("Bike", 0, 25),
    CAR1("Golf Cart", 25000, 40),
    CAR2("Honda Civic", 100000, 60),
    CAR3("BMW M5", 200000, 80),
    CAR4("BMW M8", 300000, 120),
    CAR5("Ferrari 488 GTB", 500000, 150),
    CAR6("Lamborghini Huracán", 750000, 200),
    CAR7("Millennium Falcon", 0, 670616629); // Easter egg #4, must find and beat Han Solo in poker game to obtain car

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

    public int getMaxSpeed() {
        return maxSpeed;
    }


    @Override
    public void listAll(int currentCar) // lists all cars above the current car
    {
        int i = currentCar + 1;
        for (Cars car : Cars.values()) {
            if (car.ordinal() > currentCar) {
                System.out.println("[" + i + "]" + car);
                i++;
            }
        }
    }
    public int upgrade() // When upgrading with this as current car
    { // TODO, this responsibility should lie in the GameMaster class
        System.out.println("What car would you like to buy?\n");
        int i = this.ordinal() + 1;
        for (Cars car : Cars.values()) {
            if (car.ordinal() == i) {
                System.out.println("[" + i + "]" + car);
                i++;
            }
        }
        int upgradeChoice = this.sc.nextInt();
        if(upgradeChoice >= i || upgradeChoice <= this.ordinal())
        {
            System.out.println("Invalid choice, try again");
            return upgrade();
        }
        return upgradeChoice;
    }

    @Override
    public int getNumber()
    {
        return this.ordinal();
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
    public Cars exists(int index) // Returns the enum if it exists, otherwise null
    {
        for (Cars c : Cars.values()) {
            if (c.ordinal() == index) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString()
    {
        return name + ", Price: " + price + ", Max speed: " + maxSpeed;
    }
}
