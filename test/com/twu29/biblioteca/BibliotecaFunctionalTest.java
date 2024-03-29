package com.twu29.biblioteca;

import com.twu29.biblioteca.menu.MenuTest;
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
     String username = "111-1111";
     String password = "uttermostly wrong password";
     String instructions = MenuTest.VIEW_BOOKS + and + MenuTest.REQUEST_A_BOOK + and + aBookNumber + and +
              MenuTest.CHECK_LIBRARY_NUMBER + and + MenuTest.VIEW_MOVIES_CATALOG + and +
             MenuTest.LOGIN + and + username + and + password + and + quit + "\n";

     String expectedOutput = readExpectedOutputFrom("resources/FunctionalTestOutput.txt");

     BibliotecaFactory bibliotecaFactory = new BibliotecaFactory(instructions);
     Biblioteca  biblioteca = bibliotecaFactory.getBiblioteca();
     biblioteca.run();

     assertEquals(expectedOutput, bibliotecaFactory.consoleOutput());
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
