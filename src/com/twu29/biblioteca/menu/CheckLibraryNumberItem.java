package com.twu29.biblioteca.menu;

import com.twu29.biblioteca.UserDataBase;
import com.twu29.biblioteca.menu.MenuItem;

public class CheckLibraryNumberItem extends MenuItem {

    private UserDataBase userDataBase;

    public CheckLibraryNumberItem(UserDataBase userDataBase) {
        super("check your library number", "Please talk to Librarian. Thank you.");
        this.userDataBase = userDataBase;
    }

    @Override
    public String execute() {
        if (userDataBase.getCurrentUser().isLoggedIn())
            return "Your Library number is: " + userDataBase.getCurrentUser().getUsername();

        return super.execute();
    }
}
