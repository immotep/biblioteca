package com.twu29.biblioteca.menu;

import com.twu29.biblioteca.Biblioteca;
import com.twu29.biblioteca.BibliotecaFactory;
import com.twu29.biblioteca.Book;
import com.twu29.biblioteca.Library;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RequestABookItemTest {

    private Library library = new Library();
    private BibliotecaFactory bibliotecaFactory = new BibliotecaFactory("someUserInput");
    private Biblioteca  biblioteca = bibliotecaFactory.getBiblioteca();

    RequestABookItem requestABook = new RequestABookItem(biblioteca, library);


    @Test
    public void testReserveABook() throws Exception {
        Book book = new Book("someId");

        assertEquals(false, book.isReserved());
        assertEquals("Thank You! Enjoy the book.", requestABook.process(book));

    }

    @Test
    public void testBookAlreadyReserved() throws Exception {
        Book book = new Book("someId");
        book.reserve();

        assertEquals("Book already reserved by a member.", requestABook.process(book));
    }

    @Test
    public void testBookNotExisting() throws Exception {
        assertEquals("Sorry we don't have that book yet.", requestABook.process(null));
    }

}
