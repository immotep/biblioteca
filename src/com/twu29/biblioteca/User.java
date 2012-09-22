package com.twu29.biblioteca;

public class User {

    private boolean status = false;

    public boolean IsloggedIn() {
        return status;
    }

    public void login() {
        status = true;
    }
}
