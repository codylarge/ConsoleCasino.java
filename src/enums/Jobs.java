package enums;

import interfaces.PlayerData;

public enum Jobs implements PlayerData
{
    DEFAULTJOB("Unemployed", 250, ""),
    JOB1("Plumber", 50000, "Contract-Contract"),
    JOB2("Teacher", 80000, "School"),
    JOB3("Professor", 150000, "College"),
    JOB4("Programmer", 300000, "Microsoft"),
    JOB5("Doctor", 1000000, "Hospital"),
    JOB6("CEO", 2500000, "Microsoft HQ"),
    JOB7("PRESIDENT", 9999999, "White House"); //Easter egg #1

    private String name;
    private int salary;
    private String location;

    Jobs(String name, int salary, String location) {
        this.name = name;
        this.salary = salary;
        this.location = location;
    }



    public int getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
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
        return this.name + ", Salary: " + this.getSalary() + ", Location: " + this.location;
    }
}
