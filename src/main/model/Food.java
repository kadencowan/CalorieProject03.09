package main.model;

import main.Exceptions.InvalidInputException;
import main.Exceptions.InvalidMenuSelectionException;

public abstract class Food {
    static int counter;
    static int calories;
    static String name;
    static int total;
    public Food() {
    }

    public static int getCounter() { return counter; }

    public static int getCalories() {
        return calories;
    }

    public static String getName() {
        return name;
    }

    public static int getTotal() {
        return total;
    }

    public static void setCounter(int counter) {
        Food.counter = counter;
    }

    public static void setCalories(int calories) {
        Food.calories = calories;
    }

    public static void setName(String name) {
        Food.name = name;
    }

    public static void setTotal(int total) {
        Food.total = total;
    }


    public abstract void removefood(String removename, int removecals) throws InvalidInputException;
   // public abstract void removefood();

}











