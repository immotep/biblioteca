package com.twu29.biblioteca;

import java.io.*;

public class Biblioteca {

    private InputStream inputStream;
    private PrintStream outPrintStream;
    private Menu menu = new Menu();

    public Biblioteca(InputStream inputStream, PrintStream out) {
        this.inputStream = inputStream;
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

    public String consoleInput() {

        String input ="";
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            input = bufferedReader.readLine();
        } catch (IOException e){
            outPrintStream.println("couldn't read user input");
        }
        return input;
    }

    // ---------------------------------------------------------------------------------------------
    public void run(){
        printWelcomeScreen();
        printMenu();
    }

   public static void main (String[] args){
       new Biblioteca(System.in, System.out).run();
   }
}

