package com.twu29.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    String[] details;

    @Before
    public void setUp() throws Exception {
        details = new String[]{"Naval Andrian", "011 489 1907", "naval@naval.nav"};

    }

    @Test
    public void testIsNotLoggedInByDefault() throws Exception {
        User user = new User("libraryNumber", "password",details);

        assertEquals(false, user.isLoggedIn());
    }

    @Test
    public void testWrongUsername() throws Exception {
        User user = new User("111-1111", "pass_1",details);
        user.login("wrongUsername", "pass_1");

        assertEquals(false, user.isLoggedIn());
    }

    @Test
    public void testWrongPassword() throws Exception {
        User user = new User("111-1111", "pass_1",details);
        user.login("111-1111", "wrongpassword");

        assertEquals(false, user.isLoggedIn());
    }


    @Test
    public void testUserLoggedIn() throws Exception {
        User user = new User("111-1111", "pass_1",details);
        user.login("111-1111", "pass_1");

        assertEquals(true, user.isLoggedIn());
    }

    @Test
    public void testLogOut() throws Exception {
        User user = new User("111-1111", "pass_1",details);
        user.login("111-1111", "pass_1");

        user.logout();

        assertEquals(false, user.isLoggedIn());
    }

    @Test
    public void details_returns_userDetails() throws Exception {
        User user = new User("111-1111", "pass_1",details);
        String expected =  "Library Number: 111-1111\n" +
                           "Name: Naval Andrian\n" +
                           "Phone Number: 011 489 1907\n"+
                           "Email: naval@naval.nav";

        assertEquals(expected, user.details());
    }
}
