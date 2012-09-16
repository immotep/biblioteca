package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RequestABookItemTest {
    @Test
    public void testExecuteCommand() throws Exception {

        BibliotecaTestDouble biblioteca = new BibliotecaTestDouble("1");
        RequestABookItem requestABook = new RequestABookItem(biblioteca);

        requestABook.execute();

        assertEquals("> \nThank You! Enjoy the book.", biblioteca.consoleOutput());
    }
}
