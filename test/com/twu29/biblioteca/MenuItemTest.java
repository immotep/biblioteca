package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MenuItemTest {

    @Test
    public void testMenuItemAsOption() throws Exception {
        String intent = "something to do, appearing on the menu";
        MenuItem menuItem = new MenuItem(intent);

        assertEquals(intent, menuItem.getIntent());
    }

    @Test
    public void testSelectMenuItemMessage() throws Exception {
        MenuItem menuItem = new MenuItem("something to do, appearing on the menu");
        assertNull(menuItem.select());

    }
}
