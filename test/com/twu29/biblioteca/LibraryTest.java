package com.twu29.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LibraryTest {

    public static final String LIST_OF_ALL_BOOKS = "1. Book 0 ID\n2. Book 1 ID\n3. Book 2 ID\n4. Book 3 ID\n";

    @Test
    public void testListOfAllBooks() throws Exception {
        Library library = new Library();

        assertEquals(LIST_OF_ALL_BOOKS, library.listOfAllBooks());

    }
}
