package com.twu29.biblioteca;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BibliotecaFactory {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Biblioteca biblioteca;

    public BibliotecaFactory(String input){
        biblioteca = new Biblioteca(new ByteArrayInputStream(input.getBytes()), new PrintStream(outContent));
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public String consoleOutput(){
        return outContent.toString().trim();
    }
}
