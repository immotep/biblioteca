package com.twu29.biblioteca;

import java.util.*;

public class Menu {
     public String select(String optionIdentifier) {
         return "corresponding " + optionIdentifier + " menu selected";
     }

    private List<MenuItem> menuList = new ArrayList<MenuItem>();


    public String getMessage() {
        return "Select a valid option";
    }

    public String menulist() {
        return "view all books in the library";
    }
}
