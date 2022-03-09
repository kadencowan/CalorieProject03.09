
package main.ui;


import main.Exceptions.InvalidInputException;
import main.Exceptions.InvalidMenuSelectionException;
import main.model.*;


import java.io.IOException;

import java.util.Arrays;

import java.util.Scanner;




//Requires:the user to have entered at least one item and saved it
//Effects: reads total from outputfile.txt and passes "your saved total" and the
// value saved to new food, then continues the Main.userinterface
//Modifies: adds the retrieved total to the current value

//Requires:some value in total, blank outputfile.txt
//Effects:saves the users total for later retrieval
//Modifies:writes current value of total to outputfile.txt



 public class userinterface implements Loadable, Savable {
    //REQUIRES:User input calories value and food name
    //MODIFIES:Foods total, counter, outputfile.txt
    //EFFECTS: Interacts with the user till they are satisfied,
    // calling newfood and optionally removefood,  printinfo,
    // save, load or quit to display the daily totals
   public static void main(final String[] args) throws IOException, InvalidMenuSelectionException {
       int ans =0;

       do {

           Scanner scan = new Scanner(System.in);
           for (String s : Arrays.asList("      What would you like to do?     ",
                   "Press '1' for load a saved calorie list ",
                   "Press '2' for to save the current list",
                   "Press '3' to add a food to today's list ",
                   "Press '4' to add a drink to today's list ",
                   "Press '5' to remove a food/drink from today's list",
                   "Press '6' to print your info for today",
                   "Press '7' to end the program")) {
               System.out.println(s);
           }
           ans = scan.nextInt();
           try {
               if(ans<=7&&ans>=1){
               if (ans == 1) {
                   Loadable.load();
               } else if (ans == 2) {
                   Savable.overwrite();
                   Savable.save();
               } else if (ans == 3) {
                       Scanner in = new Scanner(System.in);
                       System.out.println(
                               "Please enter a new food name,followed by the calorie count");
                       String foodname = in.nextLine();
                       int foodcals = in.nextInt();
                       Food a = new Edible();
                       Edible.newfood(foodname, foodcals);


               } else if (ans == 4) {
                   Scanner in = new Scanner(System.in);
                   System.out.println(
                           "Please enter a new drink name, followed by the calorie count");
                   String drinkname = in.nextLine();
                   int drinkcals = in.nextInt();
                   Food a = new Drinkable();
                   Drinkable.newdrink(drinkname, drinkcals);
               } else if (ans == 5) {
                   System.out.println("What would you like to remove?");
                   String removename = scan.nextLine();
                   int removecals = scan.nextInt();
                   Food a = new Edible();
                   a.removefood(removename, removecals);
               } else if (ans == 6) {
                   Print b = new Print();
                   Print.printinfo();
               } else {
                   System.out.println("Have a nice day!");
               }}else{
                   throw new InvalidMenuSelectionException();
               }
           } catch (InvalidInputException | InvalidMenuSelectionException e) {
               System.out.println(e.getMessage());
           } finally {
               ans =1;
           }

       }
           while (ans == 1 || ans == 2 || ans == 3 || ans == 4 || ans == 5 || ans == 6) ;
       }


   }

