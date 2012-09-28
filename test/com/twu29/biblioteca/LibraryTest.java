package com.twu29.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

public class LibraryTest {

    Library library = new Library();


    @Test
    public void testListOfAllBooks() throws Exception {
        String listOfAllBooks = "1. Book 0 ID\n2. Book 1 ID\n3. Book 2 ID\n4. Book 3 ID";
        assertEquals(listOfAllBooks, library.listOfAllBooks());
    }

    @Test
    public void testFindExistingBook() {

        assertEquals("Book 1 ID", library.find("2").getId());
    }

    @Test
    public void testFindOutOfBoundBookNumber() {

        assertNull(library.find("999999"));
    }

    @Test
    public void testFindNonSenseBookNumber() {

        assertNull(library.find("afajkfjakfja"));
    }

}
