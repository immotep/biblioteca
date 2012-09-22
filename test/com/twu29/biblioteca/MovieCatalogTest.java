package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieCatalogTest {
    @Test
    public void testlistOfAllMovies() throws Exception {

        String listOfAllMovies ="Movie     Name    Director   Rating";

        MovieCatalog movieCatalog = new MovieCatalog();
        assertEquals(listOfAllMovies, movieCatalog.listAllMovies());
    }
}
