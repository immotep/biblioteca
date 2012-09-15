package com.twu29.biblioteca;

public class MenuItem {

    private String intent;

    public MenuItem(String operation) {

        this.intent = operation;
    }

    public String select() {
        return null;
    }

    public String getIntent() {
        return intent;
    }
}
