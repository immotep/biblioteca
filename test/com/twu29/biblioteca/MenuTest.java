package com.twu29.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MenuTest {

    @Test
    public void testSelectOption() throws Exception {
        Menu menu = new Menu();

        assertEquals("corresponding bljkfjalfa menu selected", menu.select("bljkfjalfa"));
    }

    @Test
    public void testSelectValidOption() throws Exception {
        Menu menu = new Menu();
        menu.select("invalid option");

        assertEquals("Select a valid option", menu.getMessage());
    }
}
