package main.model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public interface Savable {

    static void save() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("./savedata/outputfile.txt/");

        if (Food.total == 0) {
            System.out.println("Please enter some calories first");
        } else {
            String savestring = Integer.toString(Food.total);
            writer.write(savestring);
            System.out.println("You have saved " + savestring);
            writer.close();
        }
    }

    static void overwrite() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("./savedata/outputfile.txt/");
        writer.print("");
        writer.close();
    }
}
