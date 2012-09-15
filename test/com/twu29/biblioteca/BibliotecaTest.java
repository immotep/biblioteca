package com.twu29.biblioteca;


import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;

public class BibliotecaTest {

    OutputStream outcontent = new ByteArrayOutputStream();

    public String consoleOutput() {
        return outcontent.toString().trim();
    }

    @Test
    public void testWelcomeScreen() throws Exception {
        String welcomeMessage = "    Welcome to the Bangalore Library System";
        String  bar = "===============================================";
        welcomeMessage = bar + "\n" + welcomeMessage + "\n" + bar;
        Biblioteca  biblioteca = new Biblioteca(new ByteArrayInputStream("userInput".getBytes()), new PrintStream(outcontent));

        biblioteca.printWelcomeScreen();

        assertEquals(welcomeMessage, consoleOutput());
    }

    @Test
    public void testGetUserInput() throws Exception {

        Biblioteca biblioteca = new Biblioteca(new ByteArrayInputStream("userInput".getBytes()), new PrintStream(outcontent));

        assertEquals("userInput", biblioteca.consoleInput());
    }

    @Test
    public void testProcessUserChoice() throws Exception {
        Biblioteca biblioteca = new Biblioteca(new ByteArrayInputStream("1".getBytes()), new PrintStream(outcontent));

        biblioteca.processUserChoice("1");

        assertEquals(LibraryTest.LIST_OF_ALL_BOOKS.trim(), consoleOutput());
     }
}
