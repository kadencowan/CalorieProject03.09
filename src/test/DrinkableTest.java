package test;

import main.Exceptions.InvalidInputException;
import main.model.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.FileNotFoundException;

import static main.model.Food.total;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DrinkableTest {


    @BeforeEach
    void setUp() throws FileNotFoundException {
        Savable.overwrite();
        total = 0;
        Food.counter = 0;
    }

    @AfterEach
    void tearDown() throws FileNotFoundException {
        Savable.overwrite();
    }

    @Test
    void newdrink() throws InvalidInputException {
        Drinkable.newdrink("Coke", 300);
        assertEquals(300,total);
    }

    @Test
    void removefood() throws InvalidInputException {
        Drinkable.newdrink("Coke", 330);
        Food a = new Edible();
        a.removefood("Coke", 300);
        assertEquals(30, total);
    }
}