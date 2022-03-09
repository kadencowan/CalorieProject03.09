package main.model;

import main.Exceptions.InvalidInputException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static main.model.Edible.newfood;


public interface Loadable {
    static void load() throws IOException, InvalidInputException {
        List<String> lines = Files.readAllLines(
                Paths.get("./savedata/outputfile.txt/"));
        int savedtotal = Integer.parseInt(lines.get(0));
        newfood("your saved total", savedtotal);
    }
}
