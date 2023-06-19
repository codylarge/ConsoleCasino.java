package utils;

import player_data.enums.Cars;
import player_data.enums.Houses;
import player_data.enums.Jobs;

import java.util.Scanner;

public class GameUtils
{
    static Scanner sc = new Scanner(System.in);
    private GameUtils() { throw new IllegalStateException("Utility class: " + this.getClass().toString() + " should not be instantiated. Call using GameUtils.method"); }

    public static void printRules()
    {
        System.out.println("Welcome to ConsoleCasino! The rules are simple: ");
    }

    //TODO: Duplication can be reduced by using a generic method
    public static Cars getCarAt(int n) {
        Cars[] values = Cars.values();
        if (n >= 0 && n < values.length) {
            return values[n];
        }
        return null; // or throw an exception indicating invalid input
    }

    public static Houses getHouseAt(int n) {
        Houses[] values = Houses.values();
        if (n >= 0 && n < values.length) {
            return values[n];
        }
        return null; // or throw an exception indicating invalid input
    }

    public static Jobs getJobAt(int n)
    {
        Jobs[] values = Jobs.values();
        if (n >= 0 && n < values.length) {
            return values[n];
        }
        return null; // or throw an exception indicating invalid input
    }
}
