package com.twu29.biblioteca;

import java.io.PrintStream;

public class Biblioteca {

    private PrintStream outPrintStream;
    private Menu menu = new Menu();

    public Biblioteca(PrintStream out) {
        this.outPrintStream = out;
    }

    public void printWelcomeScreen() {
        String welcomeMessage = "    Welcome to the Bangalore Library System";
        String  bar = "===============================================";
        welcomeMessage = bar + "\n" + welcomeMessage + "\n" + bar;
        outPrintStream.println(welcomeMessage);
    }

    public void printMenu(){
        outPrintStream.println(menu.menuListText());
    }

    public void run(){
        printWelcomeScreen();
        printMenu();
    }

   public static void main (String[] args){
       new Biblioteca(System.out).run();
   }
}
