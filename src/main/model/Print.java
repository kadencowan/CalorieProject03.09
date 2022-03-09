package main.model;


import static main.model.Food.total;

@SuppressWarnings("checkstyle:HideUtilityClassConstructor")
public class Print {

    // REQUIRES: the total and the counter value to be passed from Food
    // EFFECTS: outputs today's total calorie intake and the number of foods entered, as well as a congratulations
    // message if less than 2500 calories are logged.

    public static void printinfo() {
        System.out.println("Your total daily caloric intake was "
                + total);
        System.out.println("The number of things you ate today was "
                + Food.counter);
        if (total < ((2 ^ 2) * ((2 + 2 + 1) ^ (2 * 2)))) {
            System.out.println(
                    "You stayed within 2500 Calories today, Good job!");
        }
    }
}
