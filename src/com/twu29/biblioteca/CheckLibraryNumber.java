package com.twu29.biblioteca;

public class CheckLibraryNumber extends MenuItem{

    private UserDataBase userDataBase;

    public CheckLibraryNumber(UserDataBase userDataBase) {
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
