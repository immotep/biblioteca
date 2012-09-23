package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogInItemTest {

    UserDataBase userDataBase = new UserDataBase();
    Biblioteca biblioteca = Biblioteca.create("something");
    private LogInItem loginItem = new LogInItem(biblioteca, userDataBase);

    @Test
    public void testProcessSuccessfulUserLogin() throws Exception {
        assertEquals("You have successfully logged in", loginItem.process("111-1111", "pass_0"));
    }

    @Test
    public void testProcessUserNotExisting() throws Exception {
        assertEquals("Wrong username and/or password", loginItem.process("wrong username", "pass_0"));
    }

    @Test
    public void testProcessWrongPassword() throws Exception {
        assertEquals("Wrong username and/or password", loginItem.process("111-1111", "wrong password"));
    }

    @Test
    public void testLogOutCurrentUser() throws Exception {

        userDataBase.loginCurrentUser("111-1111", "pass_0");

        assertEquals("You have successfully logged out", loginItem.execute());
        assertEquals(false, userDataBase.getCurrentUser().isLoggedIn());
    }

    @Test
    public void testLogInUser() throws Exception {
        Biblioteca biblioteca = Biblioteca.create("111-1111\npass_0");
        LogInItem loginItem = new LogInItem(biblioteca, userDataBase);

        assertEquals("You have successfully logged in", loginItem.execute());
    }
}
