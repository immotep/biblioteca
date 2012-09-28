package com.twu29.biblioteca.menu;

public class MenuItem {

    private String description;
    private String message;

    public MenuItem(String description, String message) {
        this.description = description;
        this.message = message;
    }

    public String execute() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}


