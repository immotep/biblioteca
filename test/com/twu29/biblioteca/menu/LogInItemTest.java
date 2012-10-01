package com.twu29.biblioteca.menu;

import com.twu29.biblioteca.Biblioteca;
import com.twu29.biblioteca.BibliotecaFactory;
import com.twu29.biblioteca.UserDataBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogInItemTest {

    private UserDataBase userDataBase = new UserDataBase();
    private BibliotecaFactory bibliotecaFactory = new BibliotecaFactory("someUserInput");
    private Biblioteca  biblioteca = bibliotecaFactory.getBiblioteca();
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
        BibliotecaFactory bibliotecaFactory = new BibliotecaFactory("111-1111\npass_0");
        Biblioteca  biblioteca = bibliotecaFactory.getBiblioteca();
        LogInItem loginItem = new LogInItem(biblioteca, userDataBase);

        assertEquals("You have successfully logged in", loginItem.execute());
    }

    @Test
    public void testLogInDescription() throws Exception {
       assertEquals("login", loginItem.getDescription());
    }

    @Test
    public void testLogOutDescription() throws Exception {

        userDataBase.loginCurrentUser("111-1111", "pass_0");

        assertEquals("logout", loginItem.getDescription());
    }

}
