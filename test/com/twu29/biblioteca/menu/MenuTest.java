package com.twu29.biblioteca.menu;

import com.twu29.biblioteca.Biblioteca;
import com.twu29.biblioteca.InvalidOptionException;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MenuTest {

    private Biblioteca biblioteca = Biblioteca.create("someInput");
    private Menu menu = new Menu(biblioteca);
    private String menuList = menu.menuListText();

    private static final int JAVA_INDEX_OFFSET = 1;
    public static final int VIEW_BOOKS_INDEX = 0;
    public static final String VIEW_BOOKS = String.valueOf(VIEW_BOOKS_INDEX + JAVA_INDEX_OFFSET);
    public static final int REQUEST_A_BOOK_INDEX =  1;
    public static final String REQUEST_A_BOOK = String.valueOf(REQUEST_A_BOOK_INDEX + JAVA_INDEX_OFFSET);
    public static final int CHECK_LIBRARY_NUMBER_INDEX = 2;
    public static final String CHECK_LIBRARY_NUMBER = String.valueOf(CHECK_LIBRARY_NUMBER_INDEX + JAVA_INDEX_OFFSET);
    public static final int VIEW_MOVIES_CATALOG_INDEX = 3;
    public static final String VIEW_MOVIES_CATALOG = String.valueOf(VIEW_MOVIES_CATALOG_INDEX + JAVA_INDEX_OFFSET);
    public static final int LOGIN_INDEX = 4;
    public static final String LOGIN = String.valueOf(LOGIN_INDEX + JAVA_INDEX_OFFSET) ;

    @Test
    public void testViewAllBooksInLibraryIsTheFirstLineOnMenuList() throws Exception {

        String firstLineOfMenuList = menuList.split("\n")[VIEW_BOOKS_INDEX];

        assertEquals("To view all books in the library, type " + VIEW_BOOKS, firstLineOfMenuList);
    }

    @Test
    public void testReserveABookIsAlsoOnMenuList() throws Exception {
        String secondLineOfMenuList = menuList.split("\n")[REQUEST_A_BOOK_INDEX];

        assertEquals("To reserve a book, type " + REQUEST_A_BOOK, secondLineOfMenuList);
    }

    @Test
    public void testSelectMenuForExistingOptions() throws Exception{

        assertEquals("view all books in the library", menu.select(VIEW_BOOKS).getDescription());
        assertEquals("reserve a book", menu.select(REQUEST_A_BOOK).getDescription());
        assertEquals("check your library number", menu.select(CHECK_LIBRARY_NUMBER).getDescription());
        assertEquals("view our movie catalog", menu.select(VIEW_MOVIES_CATALOG).getDescription());
        assertEquals("login", menu.select(LOGIN).getDescription());
    }

    @Test
    public void testSelectMenuForMenuNumberOutOfBound() {

        try {
            menu.select("9999999999");
        } catch (InvalidOptionException e){
            assertEquals("Select a valid option!!", e.getMessage());
        }
    }

    @Test
    public void testSelectMenuForUnComprehensibleText() {

        try {
            menu.select("afafafgdagakljanvjanjkhvui");
        } catch (InvalidOptionException e){
            assertEquals("Select a valid option!!", e.getMessage());
        }
    }

    @Test
    public void testCheckLibraryNumberIsOnMenuList() throws Exception {
        String thirdLineOfMenuList = menuList.split("\n")[CHECK_LIBRARY_NUMBER_INDEX];

        assertEquals("To check your library number, type " + CHECK_LIBRARY_NUMBER, thirdLineOfMenuList);
    }

    @Test
    public void testViewMovieCatalogIsOnMenuList() throws Exception {
        String fourthLineOfMenuList = menuList.split("\n")[VIEW_MOVIES_CATALOG_INDEX];

        assertEquals("To view our movie catalog, type " + VIEW_MOVIES_CATALOG, fourthLineOfMenuList);
    }

    @Test
    public void testLogInIsOnMenuList() throws Exception {
        String fifthLineOfMenuList = menuList.split("\n")[LOGIN_INDEX];

        assertEquals("To login, type " + LOGIN, fifthLineOfMenuList);
    }
}
