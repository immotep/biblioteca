package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void testDetails() throws Exception {
        String title = "Sholay";
        String actor = "Ramesh";
        String director = "Sippy";
        String movieDetails = title + " " + actor + " " + director + " " + "N/A";
        Movie movie = new Movie( title , actor, director);

        assertEquals(movieDetails, movie.details());
    }
}
