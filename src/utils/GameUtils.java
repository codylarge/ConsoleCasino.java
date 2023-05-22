package utils;

import java.util.Scanner;

public class GameUtils
{
    static Scanner sc = new Scanner(System.in);
    private GameUtils() { throw new IllegalStateException("Utility class: " + this.getClass().toString() + " should not be instantiated. Call using GameUtils.method"); }

    public static void printRules()
    {
        System.out.println("Welcome to ConsoleCasino! The rules are simple: ");
    }
}
