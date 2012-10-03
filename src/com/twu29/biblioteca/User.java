package com.twu29.biblioteca;

public class User {

    private boolean status = false;
    private final String username;
    private final String password;
    private String name;
    private String phone;
    private String email;

    public User(String username, String password, String[] details) {
        this.username = username;
        this.password = password;
        name = details[0];
        phone = details[1];
        email = details[2];
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

    public String details() {
        String details = "Library Number: " + username + "\n";
        details += "Name: " + name + "\n";
        details += "Phone Number: " + phone +  "\n";
        details += "Email: " + email;

        return details;
    }
}
