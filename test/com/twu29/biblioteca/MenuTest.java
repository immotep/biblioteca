package com.twu29.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MenuTest {

    private BibliotecaTestDouble biblioteca = new BibliotecaTestDouble("someInput");
    private Menu menu = new Menu(biblioteca);
    private String menuList = menu.menuListText();

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

    @Test
    public void testSelectMenuForExistingOptions() {

        assertEquals("view all books in the library", menu.select("1").getDescription());
        assertEquals("reserve a book", menu.select("2").getDescription());
    }

    @Test
    public void testSelectMenuForInvalidOption() {

        assertEquals("entered a number but no corresponding option", menu.select("999").getDescription());
        assertEquals("entered rubbish text (not a number)", menu.select("aafalakfjkaj").getDescription());
    }

}
