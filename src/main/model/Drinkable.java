package main.model;

import main.Exceptions.InvalidInputException;

public class Drinkable extends Food {


    public static void newdrink(final String name, final int calories) throws InvalidInputException {
        Food.calories = calories;
        Food.name = name;
          if (calories>0) {
              System.out.println("You entered "
                      + Food.name + " this has " + calories + " Calories. ");
              total += calories;
              counter++;
          } else{ throw new InvalidInputException();}
          }


    @Override
    public void removefood(
            final String removename, final int removecals) {
        System.out.println("You removed " + name + " with "
                + calories + " Calories. ");
        total -= calories;
        counter--;
    }
}
