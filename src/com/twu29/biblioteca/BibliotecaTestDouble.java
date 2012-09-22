package com.twu29.biblioteca;

import java.io.*;

public class BibliotecaTestDouble extends Biblioteca {

    private OutputStream outContent;

    public BibliotecaTestDouble(String input) {
        this(input, new ByteArrayOutputStream());
    }

    public BibliotecaTestDouble(String input, OutputStream outContent) {
        super(new ByteArrayInputStream(input.getBytes()), new PrintStream(outContent));
        this.outContent = outContent;
    }

    @Override
    public String consoleOutput() {
        return outContent.toString().trim();
    }
}
