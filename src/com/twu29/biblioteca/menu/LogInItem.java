package com.twu29.biblioteca.menu;

import com.twu29.biblioteca.Biblioteca;
import com.twu29.biblioteca.UserDataBase;
import com.twu29.biblioteca.menu.MenuItem;

public class LogInItem extends MenuItem {
    private final Biblioteca biblioteca;
    private final UserDataBase userDataBase;

    public LogInItem(Biblioteca biblioteca, UserDataBase userDataBase) {
        super("login", "You have successfully logged in");
        this.biblioteca = biblioteca;
        this.userDataBase = userDataBase;
    }

    @Override
    public String getDescription() {
        if (userDataBase.getCurrentUser().isLoggedIn()){
            return "logout";
        }
        return super.getDescription();
    }

    @Override
    public String execute() {
        if (userDataBase.getCurrentUser().isLoggedIn()){
            userDataBase.getCurrentUser().logout();
            return "You have successfully logged out";
        }

        return process(userInput("username:"), userInput("password:"));
    }

    private String userInput(String label) {
        biblioteca.printToScreen(label);
        return biblioteca.consoleInput();
    }

    public String process(String username, String password) {
        if (userDataBase.loginCurrentUser(username, password))
            return "You have successfully logged in";

        return "Wrong username and/or password";
    }
}
