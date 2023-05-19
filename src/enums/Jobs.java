package enums;

public enum Jobs
{
    DEFAULT("Unemployed", 250, ""),
    JOB1("Job One", 1000, "Location One"),
    JOB2("Job Two", 2500, "Location Two"),
    JOB3("Job Three", 5000, "Location Three"),
    JOB4("Job Four", 10000, "Location Four"),
    JOB5("Job Five", 25000, "Location Five"),
    JOB6("Job Six", 100000, "Location Six");

    private String name;
    private int salary;
    private String location;

    Jobs(String name, int salary, String location) {
        this.name = name;
        this.salary = salary;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }

    public String toString()
    {
        return this.name + ", Salary: " + this.getSalary() + ", Location: " + this.location;
    }
}
