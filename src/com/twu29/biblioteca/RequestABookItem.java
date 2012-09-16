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
        return process(getBook());
    }

    public String process(Book book) {
        if (book == null)
            return "Sorry we don't have that book yet.";
        if (book.isReserved())
            return "Book already reserved by someone else.";

        book.reserve();
        return "Thank You! Enjoy the book.";
    }

    private Book getBook() {
        biblioteca.printToScreen(super.execute());     // because you have to get a book number from the user
        String bookNumber = biblioteca.consoleInput();

        return library.find(bookNumber);
    }
}
