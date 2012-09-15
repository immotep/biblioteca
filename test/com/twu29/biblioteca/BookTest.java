package com.twu29.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BookTest {
    @Test
    public void testReserveABook() throws Exception {
         Book book = new Book("someID");

         book.reserve();

        assertEquals(true, book.isReserved());
    }
}
