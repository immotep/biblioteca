package com.twu29.biblioteca;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static junit.framework.Assert.assertEquals;

public class BibliotecaFunctionalTest {

    @Test
    public void testBibliotecaMain() throws Exception {
     String and = "\n";
     String quit = "q";
     String aBookNumber = "2";
     String instructions = MenuTest.VIEW_BOOKS + and + MenuTest.REQUEST_A_BOOK + and + aBookNumber + and + quit + "\n";

     String expectedOutput = readExpectedOutputFrom("test/com/twu29/biblioteca/bibliotecaFunctionalTestOutput.txt");

     BibliotecaTestDouble  biblioteca = new BibliotecaTestDouble(instructions);
     biblioteca.run();

     assertEquals(expectedOutput, biblioteca.consoleOutput());
    }


    private String readExpectedOutputFrom(String filename) {
        File file = new File(filename);

        String expectedMessage = "";
        try {
            expectedMessage = FileUtils.readFileToString(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return expectedMessage;
    }
}
