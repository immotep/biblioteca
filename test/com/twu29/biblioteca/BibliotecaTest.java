package com.twu29.biblioteca;


import org.junit.Test;

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
        Biblioteca  biblioteca = new Biblioteca(new PrintStream(outcontent));

        biblioteca.printWelcomeScreen();

        assertEquals(welcomeMessage, consoleOutput());
    }
}