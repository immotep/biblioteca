package com.twu29.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class UserDataBase {

    public static final int LIBRARY_BASE_NUMBER = 1111;
    private Map<String, User> allUsers = new HashMap<String, User>();
    private User currentUser;

    public UserDataBase() {
        createAllUsers();
        currentUser = new User("", "", new String[]{"Naval Andrian", "011 489 1907", "naval@naval.nav"});
    }

    private void createAllUsers(){
        for (int i = 0; i <10; i++){
            String libraryNumber =  "111-" + (LIBRARY_BASE_NUMBER + i);
            String name_suffix = "aval_" + i;
            String[] details = {"N" + name_suffix + " Andrian", "011 489 1907", "n" + name_suffix + "@naval.nav"};
            allUsers.put(libraryNumber, new User(libraryNumber, "pass_" + i, details));
        }
    }

    public boolean userExists(String username) {
        return allUsers.containsKey(username);
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public boolean loginCurrentUser(String username, String password) {
        if (!userExists(username))
            return false;

        User prospectUser = allUsers.get(username);
        prospectUser.login(username, password);

        if (!prospectUser.isLoggedIn()){
            return false;
        }

        currentUser = prospectUser;
        return true;
    }
}
