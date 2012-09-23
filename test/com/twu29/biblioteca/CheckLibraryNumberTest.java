package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckLibraryNumberTest {

    UserDataBase userDataBase = new UserDataBase();

    @Test
    public void testNoUserLoggedIn() throws Exception {

        CheckLibraryNumberItem checkLibraryNumber = new CheckLibraryNumberItem(userDataBase);

        assertEquals("Please talk to Librarian. Thank you.", checkLibraryNumber.execute());
    }

    @Test
    public void testAUserIsLoggedIn() throws Exception {

        CheckLibraryNumberItem checkLibraryNumber = new CheckLibraryNumberItem(userDataBase);
        userDataBase.loginCurrentUser("111-1111", "pass_0");

        assertEquals("Your Library number is: 111-1111", checkLibraryNumber.execute());
    }
}
