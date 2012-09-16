package com.twu29.biblioteca;

public class RequestABookItem extends MenuItem {

    private Biblioteca biblioteca;

    public RequestABookItem(Biblioteca biblioteca) {
        super("reserve a book", "Enter book number:");
        this.biblioteca = biblioteca;
    }

    @Override
    public void execute() {
        String bookId = biblioteca.consoleInput();
        biblioteca.printToScreen("\nThank You! Enjoy the book.");
    }
}
