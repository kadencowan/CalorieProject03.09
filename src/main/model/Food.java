package main.model;

import main.Exceptions.InvalidInputException;
import main.Exceptions.InvalidMenuSelectionException;

public abstract class Food {
    public static int counter;
    public static int calories;
    public static String name;
    public static int total;
    public abstract void removefood(String removename, int removecals) throws InvalidInputException;
   // public abstract void removefood();

}











