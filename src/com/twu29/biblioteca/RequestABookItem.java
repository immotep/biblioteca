package com.twu29.biblioteca;

public class RequestABookItem extends MenuItem {

    private Biblioteca biblioteca;
    private Library library;

    public RequestABookItem(Biblioteca biblioteca, Library library) {
        super("reserve a book", "Enter book number:");
        this.biblioteca = biblioteca;
        this.library = library;
    }

    @Override
    public String execute() {
        String bookNumber = biblioteca.consoleInput();

        Book book = library.find(bookNumber);
        if (book == null)
            return "\nSorry we don't have that book yet.";
        if (book.isReserved())
            return "\nBook already reserved by someone else.";

        book.reserve();
        return "\nThank You! Enjoy the book.";
    }
}
