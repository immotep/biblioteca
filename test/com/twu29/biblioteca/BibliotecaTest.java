package com.twu29.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BibliotecaTest {

    private Biblioteca  biblioteca = Biblioteca.create("someUserInput");

    @Test
    public void testprintToScreen() throws Exception {
        String message = "some text to print";
        biblioteca.printToScreen(message);

        assertEquals(message, biblioteca.consoleOutput());
    }

    @Test
    public void consoleInput() throws Exception {
        String input = "userTyped--Text";
        Biblioteca  biblioteca = Biblioteca.create(input);

        assertEquals(input, biblioteca.consoleInput());
    }

    @Test
    public void testQuit() throws Exception {
       assertEquals(true, biblioteca.processUserChoice("q"));
       assertEquals(true, biblioteca.processUserChoice("Q"));
    }
}
