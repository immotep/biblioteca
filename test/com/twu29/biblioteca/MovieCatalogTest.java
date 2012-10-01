package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieCatalogTest {
    @Test
    public void testlistOfAllMovies() throws Exception {

        String header = "Movie                     Year    Director                  Rating";
        String listOfAllMovies="Title 1                   1975    Director 1                1\n" +
                "Long Title 2              1990    Director 2                2\n" +
                "Title 3                   2001    Director 1                1\n" +
                "Really Long Title 1       2005    Long Director Name 1      9\n" +
                "Title 8                   2011    Dir                       N/A";

        MovieCatalog movieCatalog = new MovieCatalog();

        assertEquals(header +  "\n" + listOfAllMovies, movieCatalog.listAllMovies());
    }
}
