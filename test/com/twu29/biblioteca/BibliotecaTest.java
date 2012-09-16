package com.twu29.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BibliotecaTest {

    private BibliotecaTestDouble  biblioteca = new BibliotecaTestDouble("someUserInput");

    @Test
    public void testprintToScreen() throws Exception {
        String message = "some text to print";
        biblioteca.printToScreen(message);

        assertEquals(message, biblioteca.consoleOutput());
    }

    @Test
    public void consoleInput() throws Exception {

        String input = "userTyped--Text";
        BibliotecaTestDouble  biblioteca = new BibliotecaTestDouble(input);

        assertEquals(input, biblioteca.consoleInput());
    }
}
