package com.twu29.biblioteca;

import java.io.*;

public class Biblioteca {

    private InputStream inputStream;
    private PrintStream outPrintStream;
    private Menu menu = new Menu(this);
    private Library library = new Library();

    public Biblioteca(InputStream inputStream, PrintStream out) {
        this.inputStream = inputStream;
        this.outPrintStream = out;
    }

    public void printToScreen(String message) {
        outPrintStream.println(message);
    }

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
        outPrintStream.print("> ");

        String input = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            input = bufferedReader.readLine();
        } catch (IOException e) {
            printToScreen("couldn't read user input");
        }
        return input;
    }

    public void processUserChoice(String option) {
        MenuItem menuCommand = menu.select(option);
        printToScreen(menuCommand.response());
        menuCommand.execute();
    }

    // ---------------------------------------------------------------------------------------------
    public void run() {
        printWelcomeScreen();
        printMenu();
        processUserChoice(consoleInput());
    }

    public static void main(String[] args) {
        new Biblioteca(System.in, System.out).run();
    }
}

