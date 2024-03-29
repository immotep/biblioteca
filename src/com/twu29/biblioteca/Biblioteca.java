package com.twu29.biblioteca;

import com.twu29.biblioteca.menu.Menu;
import com.twu29.biblioteca.menu.MenuItem;

import java.io.*;

public class Biblioteca {

    private PrintStream outPrintStream;
    private Menu menu = new Menu(this);
    private BufferedReader bufferedReader;
    private boolean quit = false;

    public Biblioteca(InputStream inputStream, PrintStream out) {
        this.bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        this.outPrintStream = out;
    }

    public void printToScreen(String message) {
        outPrintStream.println(message);
    }

    //---------------------------------------------------------------------------------------------------

    public void printWelcomeScreen() {
        String welcomeMessage = "    Welcome to the Bangalore Library System";
        String bar = "===============================================";
        welcomeMessage = bar + "\n" + welcomeMessage + "\n" + bar;
        printToScreen(welcomeMessage);
    }

    public void printMenu() {
        printToScreen(menu.menuListText());
    }

    public String consoleInput() {
        outPrintStream.print(">");

        String input = "";
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            printToScreen("couldn't read user input");
        }
        return input.trim();
    }

    public boolean processUserChoice(String option) {
        if (option.toLowerCase().equals("q")) {
            return true;
        }

        try{
            MenuItem menuCommand = menu.select(option);
            printToScreen("\n" + menuCommand.execute() + "\n");
        } catch (InvalidOptionException e){
            printToScreen("\n" + e.getMessage() + "\n");
        }
        return false;
    }

    // ---------------------------------------------------------------------------------------------

    public void run() {
        printWelcomeScreen();
        while (!quit) {
            printMenu();
            quit = processUserChoice(consoleInput());
        }
    }

    public static void main(String[] args) {
        new Biblioteca(System.in, System.out).run();
    }
}

