package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuItemTest {

    @Test
    public void testDefaultMessageWhenCommandIsExecuted() throws Exception {
        String response = "interesting";
        MenuItem menuItem = new MenuItem("something the user can do, appearing on the menu", response);

        assertEquals(response, menuItem.execute());
    }
}
