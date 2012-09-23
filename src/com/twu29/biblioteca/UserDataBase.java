package com.twu29.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class UserDataBase {

    private Map<String, User> allUsers = new HashMap<String, User>();
    private User currentUser;

    public UserDataBase() {
        createAllUsers();
        currentUser = new User("", "");
    }

    private void createAllUsers(){
        for (int i = 0; i <10; i++){
            String libraryNumber =  "111-" + (1111 + i);
            allUsers.put(libraryNumber, new User(libraryNumber, "pass_" + i));
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
