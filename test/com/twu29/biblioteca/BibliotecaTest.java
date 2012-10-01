package com.twu29.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BibliotecaTest {

    private BibliotecaFactory bibliotecaFactory = new BibliotecaFactory("someUserInput");
    private Biblioteca  biblioteca = bibliotecaFactory.getBiblioteca();

    @Test
    public void testprintToScreen() throws Exception {
        String message = "some text to print";
        biblioteca.printToScreen(message);

        assertEquals(message, bibliotecaFactory.consoleOutput());
    }

    @Test
    public void consoleInput() throws Exception {
        String input = "userTyped--Text";
        BibliotecaFactory bibliotecaFactory = new BibliotecaFactory(input);
        biblioteca = bibliotecaFactory.getBiblioteca();

        assertEquals(input, biblioteca.consoleInput());
    }

    @Test
    public void testQuit() throws Exception {
       assertEquals(true, biblioteca.processUserChoice("q"));
       assertEquals(true, biblioteca.processUserChoice("Q"));
    }
}
