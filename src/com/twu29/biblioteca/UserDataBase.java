package com.twu29.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class UserDataBase {

    private Map<String, User> allUsers = new HashMap<String, User>();

    public UserDataBase() {
        createAllUsers();
    }

    private void createAllUsers(){
        for (int i = 0; i <10; i++){
            String libraryNumber =  "111-1111" + i;
            allUsers.put(libraryNumber, new User(libraryNumber, "pass_" + i));
        }
    }

    public boolean find(String username) {
        return allUsers.containsKey(username);  //To change body of created methods use File | Settings | File Templates.
    }
}
