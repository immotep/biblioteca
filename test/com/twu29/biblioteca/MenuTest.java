package com.twu29.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MenuTest {

    private BibliotecaTestDouble biblioteca = new BibliotecaTestDouble("someInput");
    private Menu menu = new Menu(biblioteca);
    private String menuList = menu.menuListText();

    private final int JAVA_INDEX_OFFSET = 1;
    private final String VIEW_BOOKS = String.valueOf(menu.VIEW_BOOKS_INDEX + JAVA_INDEX_OFFSET);
    private final String REQUEST_A_BOOK = String.valueOf(menu.REQUEST_A_BOOK_INDEX + JAVA_INDEX_OFFSET);
    private final String CHECK_LIBRARY_NUMBER = String.valueOf(menu.CHECK_LIBRARY_NUMBER_INDEX + JAVA_INDEX_OFFSET);



    @Test
    public void testViewAllBooksInLibraryIsTheFirstLineOnMenuList() throws Exception {
        System.out.println(VIEW_BOOKS + " " + REQUEST_A_BOOK + " " + CHECK_LIBRARY_NUMBER);

        String firstLineOfMenuList = menuList.split("\n")[menu.VIEW_BOOKS_INDEX];

        assertEquals("To view all books in the library, type " + VIEW_BOOKS, firstLineOfMenuList);
    }

    @Test
    public void testReserveABookIsAlsoOnMenuList() throws Exception {
        String secondLineOfMenuList = menuList.split("\n")[menu.REQUEST_A_BOOK_INDEX];

        assertEquals("To reserve a book, type " + REQUEST_A_BOOK, secondLineOfMenuList);
    }

    @Test
    public void testSelectMenuForExistingOptions() {

        assertEquals("view all books in the library", menu.select(VIEW_BOOKS).getDescription());
        assertEquals("reserve a book", menu.select(REQUEST_A_BOOK).getDescription());
        assertEquals("check your library number", menu.select(CHECK_LIBRARY_NUMBER).getDescription());
    }

    @Test
    public void testSelectMenuForInvalidOption() {

        assertEquals("entered a number but no corresponding option", menu.select("999").getDescription());
        assertEquals("entered rubbish text (not a number)", menu.select("aafalakfjkaj").getDescription());
    }

    @Test
    public void testCheckLibraryNumberIsOnMenuList() throws Exception {
        String thirdLineOfMenuList = menuList.split("\n")[menu.CHECK_LIBRARY_NUMBER_INDEX];

        assertEquals("To check your library number, type " + CHECK_LIBRARY_NUMBER, thirdLineOfMenuList);
    }

}
