package test;


import main.Exceptions.InvalidInputException;
import main.model.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;



class LoadableTest {

    @BeforeEach
    void setUp() throws FileNotFoundException {
        Savable.overwrite();
        Food.total = 0;
        Food.counter = 0;
    }

    @AfterEach
    void tearDown() throws FileNotFoundException {
        Savable.overwrite();
        Food.total = 0;
        Food.counter = 0;
        Savable.save();
    }

    @Test
    void load() throws IOException, InvalidInputException {
        Edible.newfood("apple", 150);
        Savable.save();
        Loadable.load();
    }
}