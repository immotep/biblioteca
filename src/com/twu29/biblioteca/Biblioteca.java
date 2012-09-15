package com.twu29.biblioteca;

import java.io.PrintStream;

public class Biblioteca {

    private PrintStream outPrintStream;

    public Biblioteca(PrintStream out) {
        this.outPrintStream = out;
    }

    public void printWelcomeScreen() {
        String welcomeMessage = "    Welcome to the Bangalore Library System";
        String  bar = "===============================================";
        welcomeMessage = bar + "\n" + welcomeMessage + "\n" + bar;
        outPrintStream.println(welcomeMessage);
    }

    public void run(){
        printWelcomeScreen();
    }

   public static void main (String[] args){
       new Biblioteca(System.out).run();
   }
}
