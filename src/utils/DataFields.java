package utils;

import enums.Cars;
import enums.Houses;
import enums.Jobs;

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

    public void setMoney(int money)
    {
        this.money = money;
    }

    public String toString()
    {
        return "Money: " + this.money + "\nCar: " + this.car + "\nHouse: " + this.house + "\nJob: " + this.job;
    }
}
