package com.twu29.biblioteca;

import java.util.*;

public class Menu {
    public static final int JAVA_INDEX_OFFSET = 1;
    private List<MenuItem> menuList = new ArrayList<MenuItem>();
    private Library library = new Library();
    private MovieCatalog movieCatalog = new MovieCatalog();
    private Biblioteca biblioteca;

    public static final int VIEW_BOOKS_INDEX = 0;
    public static final int REQUEST_A_BOOK_INDEX =  1;
    public static final int CHECK_LIBRARY_NUMBER_INDEX = 2;
    public static final int VIEW_MOVIES_CATALOG_INDEX = 3;

    public Menu(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        createMenuList();
    }

    private void createMenuList() {
        menuList.add(new MenuItem("view all books in the library", library.listOfAllBooks()));
        menuList.add(new RequestABookItem(biblioteca, library));
        menuList.add(new MenuItem("check your library number", "Please talk to Librarian. Thank you."));
        menuList.add(new MenuItem("view our movie catalog", movieCatalog.listAllMovies()));
    }

    public String menuListText() {
        StringBuilder allMenu = new StringBuilder();
        for (MenuItem menuItem : menuList) {
            allMenu.append("To " + menuItem.getDescription() + ", type " + String.valueOf(menuList.indexOf(menuItem) + JAVA_INDEX_OFFSET) + "\n");
        }
        return allMenu.toString().trim();
    }

    public MenuItem select(String menuNumber) throws InvalidOptionException{
        try {
            return menuList.get(Integer.parseInt(menuNumber) - JAVA_INDEX_OFFSET);       // -1 because java index starts at 0
        } catch (NumberFormatException e) {
            throw new InvalidOptionException();
        } catch (IndexOutOfBoundsException e) {
            throw new InvalidOptionException();
        }
    }
}
