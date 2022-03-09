package test;

import main.model.Edible;
import main.model.Food;
import main.Exceptions.InvalidInputException;
import main.model.Savable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;

import static main.model.Food.total;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EdibleTest {


    @BeforeEach
    void setUp() throws FileNotFoundException {
        Savable.overwrite();
        total=0;
        Food.counter=0;
    }

    @AfterEach
    void tearDown() throws FileNotFoundException {
        Savable.overwrite();
    }

    @Test
    void newfood() throws InvalidInputException {
        Edible.newfood("Chicken", -5);
        assertEquals(0, total);
    }

    @Test
    void removefood() throws InvalidInputException {
        Edible.newfood("steak", 500);
        Food a = new Edible();
        a.removefood("steak", 500);
        assertEquals(0, total);
    }
}