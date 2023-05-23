package game_data;

import enums.Cars;
import enums.Houses;
import enums.Jobs;


// The DataFields class is a class that stores some data about the player that will be changed throughout the game such as cash for easy access.
// The DataFields class also contains methods to read and update data.
public class DataFields
{
    /* DATA */
    int money;
    Cars car;
    Houses house;
    Jobs job;


    public DataFields()
    {
        this.money = 0;
        this.car = null;
        this.house = null;
        this.job = null;
    }
    public DataFields(int money, Cars car, Houses house, Jobs job)
    {
        this.money = money;
        this.car = car;
        this.house = house;
        this.job = job;
    }

    public void setMoney(int money)
    {
        this.money = money;
    }

    public void setJob(String job)
    {
        try {
            this.job = Jobs.valueOf(job.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Job not found: " + job);
        }
    }

    public void setCar(String car)
    {
        try {
            this.car = Cars.valueOf(car.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Car not found: " + car);
        }
    }
    public void setHouse(String house)
    {
        try {
            this.house = Houses.valueOf(house.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("House not found: " + house);
        }
    }
    public int getMoney()
    {
        return this.money;
    }
    public Cars getCar()
    {
        return this.car;
    }
    public Houses getHouse()
    {
        return this.house;
    }
    public Jobs getJob()
    {
        return this.job;
    }

    public String toString()
    {
        return "Money: " + this.money + "\nCar: " + this.car + "\nHouse: " + this.house + "\nJob: " + this.job;
    }
}
