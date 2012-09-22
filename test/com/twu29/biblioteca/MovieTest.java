package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void testDetails() throws Exception {
        String movieDetails = "Sholay                    Ramesh                    Sippy                     N/A";

        Movie movie = new Movie("Sholay", "Ramesh", "Sippy");

        assertEquals(movieDetails, movie.details());
    }
}
