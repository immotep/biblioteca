package com.twu29.biblioteca;

import java.util.*;

public class Menu {
    public static final int JAVA_INDEX_OFFSET = 1;
    private List<MenuItem> menuList = new ArrayList<MenuItem>();
    private Library library = new Library();
    private MovieCatalog movieCatalog = new MovieCatalog();
    private Biblioteca biblioteca;
    private UserDataBase userDataBase = new UserDataBase();

    public Menu(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        createMenuList();
    }

    private void createMenuList() {
        menuList.add(new MenuItem("view all books in the library", library.listOfAllBooks()));
        menuList.add(new RequestABookItem(biblioteca, library));
        menuList.add(new CheckLibraryNumberItem(userDataBase));
        menuList.add(new MenuItem("view our movie catalog", movieCatalog.listAllMovies()));
        menuList.add(new LogInItem(biblioteca, userDataBase));
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
