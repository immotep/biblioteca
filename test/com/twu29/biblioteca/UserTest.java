package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void testIsNotLoggedInByDefault() throws Exception {
        User user = new User("libraryNumber", "password");

        assertEquals(false, user.IsloggedIn());
    }

    @Test
    public void testWrongUsername() throws Exception {
        User user = new User("111-1111", "pass_1");
        user.login("wrongUsername", "pass_1");

        assertEquals(false, user.IsloggedIn());
    }

    @Test
    public void testWrongPassword() throws Exception {
        User user = new User("111-1111", "pass_1");
        user.login("111-1111", "wrongpassword");

        assertEquals(false, user.IsloggedIn());
    }


    @Test
    public void testUserLoggedIn() throws Exception {
        User user = new User("111-1111", "pass_1");
        user.login("111-1111", "pass_1");

        assertEquals(true, user.IsloggedIn());
    }

    @Test
    public void testLogOut() throws Exception {
        User user = new User("111-1111", "pass_1");
        user.login("111-1111", "pass_1");

        user.logout();

        assertEquals(false, user.IsloggedIn());
    }
}
