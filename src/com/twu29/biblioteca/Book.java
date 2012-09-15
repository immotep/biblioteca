package com.twu29.biblioteca;

public class Book {
    private boolean reserved = false;

    public boolean isReserved() {
        return reserved;
    }

    public void reserve() {
       reserved = true;
    }
}
