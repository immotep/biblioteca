package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void testIsNotLoggedInByDefault() throws Exception {
        User user = new User();

        assertEquals(false, user.IsloggedIn());
    }

    @Test
    public void testUserLoggedIn() throws Exception {
        User user = new User();

        user.login();

        assertEquals(true, user.IsloggedIn());
    }
}
