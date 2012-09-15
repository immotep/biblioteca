package com.twu29.biblioteca;

public class Book {
    private boolean reserved = false;
    private String id;

    public Book(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void reserve() {
        reserved = true;
    }
}
