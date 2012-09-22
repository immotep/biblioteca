package com.twu29.biblioteca;

public class InvalidOptionException extends Exception {
    @Override
    public String getMessage() {
        return  "Select a valid option!!";

    }
}
