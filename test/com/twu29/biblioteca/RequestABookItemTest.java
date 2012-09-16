package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RequestABookItemTest {

    Library library = new Library();
    BibliotecaTestDouble biblioteca = new BibliotecaTestDouble("anything");
    RequestABookItem requestABook = new RequestABookItem(biblioteca, library);


    @Test
    public void testReserveABook() throws Exception {
        Book book = new Book("someId");

        assertEquals(false, book.isReserved());
        assertEquals("\nThank You! Enjoy the book.", requestABook.process(book));
    }

    @Test
    public void testBookAlreadyReserved() throws Exception {
        Book book = new Book("someId");
        book.reserve();

        assertEquals("\nBook already reserved by someone else.", requestABook.process(book));
    }

    @Test
    public void testBookNotExisting() throws Exception {
        assertEquals("\nSorry we don't have that book yet.", requestABook.process(null));
    }

}
