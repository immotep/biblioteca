package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void testDetails() throws Exception {
        String movieDetails = "Sholay                    1975    Ramesh Sippy              N/A";

        Movie movie = new Movie("Sholay", 1975, "Ramesh Sippy");

        assertEquals(movieDetails, movie.details());
    }
}
