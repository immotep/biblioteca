package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuItemTest {
    @Test
    public void testAMenuHasOption() throws Exception {
        MenuItem menuItem = new MenuItem();
        assertEquals(null, menuItem.getOptions());
    }
}
