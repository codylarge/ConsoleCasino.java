package player_data;

import player_data.enums.Cars;

public class Car extends PlayerItem<Cars>
{
    private final int maxSpeed;
    private final Cars[] cars = Cars.values();
    public Car(Cars car)
    {
        super(car);
        this.maxSpeed = car.getMaxSpeed();
    }

    public Cars getCarAtIndex(int index)
    {
        return this.cars[index];
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String toString()
    {
        return super.toString() + ", Max speed: " + this.maxSpeed;
    }
    /*
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
    public String writeToFile()
    {
        return this.name();
    }



    public Cars exists(int index) // Returns the enum if it exists, otherwise null
    {
        for (Cars c : Cars.values()) {
            if (c.ordinal() == index) {
                return c;
            }
        }
        return null;
    }
    */
}
