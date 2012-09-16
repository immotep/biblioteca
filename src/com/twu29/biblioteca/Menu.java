package com.twu29.biblioteca;

import java.util.*;

public class Menu {
    private List<MenuItem> menuList = new ArrayList<MenuItem>();
    private Library library = new Library();

    public Menu() {
        createMenuList();
    }

    private void createMenuList() {
        menuList.add(new MenuItem("view all books in the library", library.listOfAllBooks()));
        menuList.add(new MenuItem("reserve a book", "Enter book number:"));
    }

    public String select(String optionIdentifier) {
        return "corresponding " + optionIdentifier + " menu selected";
    }

    public String getMessage() {
        return "Select a valid option";
    }

    public String menuListText() {
        StringBuilder allMenu = new StringBuilder();
        for (MenuItem aMenu : menuList) {
            allMenu.append("To " + aMenu.getDescription() + ", type " + String.valueOf(menuList.indexOf(aMenu) + 1) + "\n");
        }
        return allMenu.toString();
    }

    public MenuItem getMenuItem(String menuNumber) {
        try{
            return menuList.get(Integer.parseInt(menuNumber)-1);
        } catch(Exception e){
            return null;
        }
    }
}
