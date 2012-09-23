package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserDataBaseTest {
    @Test
    public void testUserExist() throws Exception {

        UserDataBase allUsers = new UserDataBase();

        assertEquals(true, allUsers.userExists("111-1111"));
    }

    @Test
    public void testCurrentUserIsNotLoggedIn() throws Exception {

        UserDataBase allUsers = new UserDataBase();

        assertEquals(false, allUsers.getCurrentUser().isLoggedIn());
    }

    @Test
    public void testLoginNotExistingUser() throws Exception {

        UserDataBase allUsers = new UserDataBase();

        assertEquals(false, allUsers.loginCurrentUser("not-existing-number", "pass_1"));
    }

    @Test
    public void testLoginExistingUserWithWrongPassword() throws Exception {

        UserDataBase allUsers = new UserDataBase();

        assertEquals(false, allUsers.loginCurrentUser("111-1111", "wrong_password"));
    }

    @Test
    public void testLoginCurrentUser() throws Exception {

        UserDataBase allUsers = new UserDataBase();

        assertEquals(true, allUsers.loginCurrentUser("111-1111", "pass_0"));
        assertEquals(true, allUsers.getCurrentUser().isLoggedIn());
    }
}

