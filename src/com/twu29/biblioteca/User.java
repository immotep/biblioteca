package com.twu29.biblioteca;

public class User {

    private boolean status = false;
    private final String username;
    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
     }

    public boolean isLoggedIn() {
        return status;
    }

    public void login(String username, String password) {
       if (username.equals(this.username) && password.equals(this.password))
            status = true;
    }

    public void logout() {
        status = false;
    }

    public String getUsername() {
        return username;
    }
}
