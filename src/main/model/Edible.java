package main.model;

import main.Exceptions.InvalidInputException;
import main.Exceptions.InvalidMenuSelectionException;

//REQUIRES:User input calories value and food name
//MODIFIES:assigns calorie and name values,
// and increases the total by the calorie count and increments the counter
//EFFECTS:Prints the food and calorie count entered by the user
public class Edible extends Food {

    public static void newfood (String name, int calories) throws InvalidInputException {
        try {
           Food.calories = calories;
           Food.name = name;
           if (calories>0){
           System.out.println("You entered " + Food.name
                   + " this has " + calories + " Calories. ");
           total += calories;
           counter++;}
           else{ throw new InvalidInputException();}
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } finally {
            calories=0;
            name=null;
        }
    }

    @Override
    public void removefood(final String fname, final int fcalories) throws InvalidInputException {
        if (fcalories > total) {
            throw new InvalidInputException();
        } else {
            System.out.println("You removed " + fname + " with "
                    + fcalories + " Calories. ");
            total -= fcalories;
            counter--;
        }
    }
}
