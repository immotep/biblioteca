package com.twu29.biblioteca;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BibliotecaTest {

    private BibliotecaTestDouble  biblioteca = new BibliotecaTestDouble("someUserInput");

    @Test
    public void testWelcomeScreen() throws Exception {
        String welcomeMessage = "    Welcome to the Bangalore Library System";
        String  bar = "===============================================";
        welcomeMessage = bar + "\n" + welcomeMessage + "\n" + bar;

        biblioteca.printWelcomeScreen();

        assertEquals(welcomeMessage, biblioteca.consoleOutput());
    }

    @Test
    public void consoleInput() throws Exception {

        String input = "userTyped--Text";
        BibliotecaTestDouble  biblioteca = new BibliotecaTestDouble(input);

        assertEquals(input, biblioteca.consoleInput());
    }

    @Test
    public void testProcessPrintAllBooks() throws Exception {
        biblioteca.processUserChoice("1");

        assertEquals(LibraryTest.LIST_OF_ALL_BOOKS.trim(), biblioteca.consoleOutput());
     }

    @Test
    public void testProcessReserveABook() throws Exception {
        biblioteca.processUserChoice("2");

        assertEquals("Enter book number:", biblioteca.consoleOutput());
    }
}
