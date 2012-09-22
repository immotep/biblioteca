package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserDataBaseTest {
    @Test
    public void testUserExist() throws Exception {

        UserDataBase allUsers = new UserDataBase();

        assertEquals(false, allUsers.find("111-1111"));
    }
}
