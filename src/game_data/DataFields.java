package game_data;
import player_data.Car;
import player_data.House;
import player_data.enums.Cars;
import player_data.enums.Houses;


// The DataFields class is a class that stores some data about the player that will be changed throughout the game such as cash for easy access.
// The DataFields class also contains methods to read and update data.
public class DataFields
{
    /* DATA */
    int money;
    Car car;
    House house;

    public DataFields() // Not yet used
    {
        this.money = 0;
        this.car = null;
        this.house = null;
    }

    public DataFields(int money, Car car, House house)
    {
        this.money = money;
        this.car = car;
        this.house = house;
    }

    public void setMoney(int money)
    {
        this.money = money;
    }

    public void setCar(String car)
    {
        try {
            this.car = new Car(Cars.valueOf(car.toUpperCase()));
        } catch (IllegalArgumentException e) {
            System.out.println("Car not found: " + car);
        }
    }
    public void setHouse(String house)
    {
        try {
            this.house = new House(Houses.valueOf(house.toUpperCase()));
        } catch (IllegalArgumentException e) {
            System.out.println("House not found: " + house);
        }
    }
    public int getMoney()
    {
        return this.money;
    }
    public Car getCar()
    {
        return this.car;
    }
    public House getHouse()
    {
        return this.house;
    }
    public String toString()
    {
        return "Money: " + this.money + "\nCar: " + this.car + "\nHouse: " + this.house;
    }
}
