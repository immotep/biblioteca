package com.twu29.biblioteca.menu;

import com.twu29.biblioteca.UserDataBase;
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

        String expected = "Your details: \n" +
                          "Library Number: 111-1111\n" +
                          "Name: Naval_0 Andrian\n" +
                          "Phone Number: 011 489 1907\n" +
                          "Email: naval_0@naval.nav";

        assertEquals(expected, checkLibraryNumber.execute());
    }
}
