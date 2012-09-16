package com.twu29.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

public class LibraryTest {

    public static final String LIST_OF_ALL_BOOKS = "1. Book 0 ID\n2. Book 1 ID\n3. Book 2 ID\n4. Book 3 ID\n";
    Library library = new Library();


    @Test
    public void testListOfAllBooks() throws Exception {
        assertEquals(LIST_OF_ALL_BOOKS, library.listOfAllBooks());
    }

    @Test
    public void testFindExistingBook() {

        assertEquals("Book 0 ID", library.find("1").getId());
        assertEquals("Book 1 ID", library.find("2").getId());
        assertEquals("Book 2 ID", library.find("3").getId());
        assertEquals("Book 3 ID", library.find("4").getId());
    }

    @Test
    public void testFindNotExistingBook() {

        assertNull(library.find("999999"));
        assertNull(library.find("afajkfjakfja"));
    }
}
