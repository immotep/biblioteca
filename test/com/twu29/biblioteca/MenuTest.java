package com.twu29.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MenuTest {


    private Menu menu = new Menu();
    private String menuList = menu.menuListText();

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
    public void testViewAllBooksInLibraryIsTheFirstLineOnMenuList() throws Exception {
        String firstLineOfMenuList = menuList.split("\n")[0];

        assertEquals("To view all books in the library, type 1", firstLineOfMenuList);
    }

    @Test
    public void testReserveABookIsAlsoOnMenuList() throws Exception {
        String secondLineOfMenuList = menuList.split("\n")[1];

        assertEquals("To reserve a book, type 2", secondLineOfMenuList);
    }

}
