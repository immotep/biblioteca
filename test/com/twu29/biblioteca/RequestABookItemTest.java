package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RequestABookItemTest {

    Library library = new Library();

    @Test
    public void testReserveABook() throws Exception {

        BibliotecaTestDouble biblioteca = new BibliotecaTestDouble("1");
        RequestABookItem requestABook = new RequestABookItem(biblioteca, library);

        assertEquals("\nThank You! Enjoy the book.", requestABook.execute());
    }

    @Test
    public void testBookAlreadyReserved() throws Exception {

        String bookNumber = "1";
        library.find(bookNumber).reserve();

        BibliotecaTestDouble biblioteca = new BibliotecaTestDouble(bookNumber);
        RequestABookItem requestABook = new RequestABookItem(biblioteca, library);

        assertEquals("\nBook already reserved by someone else.", requestABook.execute());
    }

    @Test
    public void testBookNotExisting() throws Exception {

        BibliotecaTestDouble biblioteca = new BibliotecaTestDouble("Not existing book number");
        RequestABookItem requestABook = new RequestABookItem(biblioteca, library);

        assertEquals("\nSorry we don't have that book yet.", requestABook.execute());
    }

}
