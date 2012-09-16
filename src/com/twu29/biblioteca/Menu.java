package com.twu29.biblioteca;

import java.util.*;

public class Menu {
    private List<MenuItem> menuList = new ArrayList<MenuItem>();
    private Library library = new Library();
    private Biblioteca biblioteca;

    public Menu(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        createMenuList();
    }

    private void createMenuList() {
        menuList.add(new MenuItem("view all books in the library", library.listOfAllBooks()));
        menuList.add(new RequestABookItem(biblioteca));
    }

    public String menuListText() {
        StringBuilder allMenu = new StringBuilder();
        for (MenuItem aMenu : menuList) {
            allMenu.append("To " + aMenu.getDescription() + ", type " + String.valueOf(menuList.indexOf(aMenu) + 1) + "\n");
        }
        return allMenu.toString();
    }

    public MenuItem select(String menuNumber) {
        try {
            return menuList.get(Integer.parseInt(menuNumber) - 1);
        } catch (NumberFormatException e) {
            return new MenuItem("entered rubbish text (not a number)", "Select a valid option!!");
        } catch (IndexOutOfBoundsException e) {
            return new MenuItem("entered a number but no corresponding option", "Select a valid option!!");
        }
    }
}
