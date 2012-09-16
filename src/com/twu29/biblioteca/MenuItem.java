package com.twu29.biblioteca;

public class MenuItem {

    private String description;
    private String message;

    public MenuItem(String description, String message) {
        this.description = description;
        this.message = message;
    }

    public String response() {
        return message;
    }

    public void execute() {

    }

    public String getDescription() {
        return description;
    }
}


