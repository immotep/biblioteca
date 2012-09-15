package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MenuItemTest {
    @Test
    public void testMenuItemAsOption() throws Exception {
        MenuItem menuItem = new MenuItem();
        assertEquals(null, menuItem.getOptions());
    }

    @Test
    public void testSelectMenuItemMessage() throws Exception {
        MenuItem menuItem = new MenuItem();
        assertNull(menuItem.select());

    }
}
