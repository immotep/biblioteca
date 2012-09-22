package com.twu29.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieCatalogTest {
    @Test
    public void testlistOfAllMovies() throws Exception {

        String header = "Movie                     Name                      Director                  Rating";
        String listOfAllMovies= "Title 1                   Actor 1                   Director 1                1" +  "\n"  +
        "Long Title 2              Actor 2                   Director 2                2"  +  "\n"  +
        "Title 3                   Actor Name 3              Director 1                1"  +  "\n"  +
        "Really Long Title 1       Actor 1                   Long Director Name 1      9"  +  "\n"  +
        "Title 8                   Really Long Actor Name    Dir                       N/A";

        MovieCatalog movieCatalog = new MovieCatalog();

        assertEquals(header +  "\n" + listOfAllMovies, movieCatalog.listAllMovies());
    }
}
