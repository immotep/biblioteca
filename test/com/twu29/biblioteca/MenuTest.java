package com.twu29.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MenuTest {


    Menu menu = new Menu();

    @Test
    public void testSelectOption() throws Exception {
       assertEquals("corresponding bljkfjalfa menu selected", menu.select("bljkfjalfa"));
    }

    @Test
    public void testSelectValidOption() throws Exception {
        menu.select("invalid option");

        assertEquals("Select a valid option", menu.getMessage());
    }

    @Test
    public void testMenuIsCreated() throws Exception {
        String menulist = "view all books in the library";

       assertEquals(menulist, menu.menulist());

    }
}
