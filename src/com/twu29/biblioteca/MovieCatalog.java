package com.twu29.biblioteca;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class MovieCatalog {
    
    private List<Movie> allMovies = new ArrayList<Movie>();
    public static final String PRINT_MOVIE_FORMAT = MessageFormat.format("%-{0}s %-7s %-{0}s %s", 25);

    public MovieCatalog() {
        createAllMovies();
    }

    private void createAllMovies() {
        allMovies.add(new Movie("Title 1", 1975, "Director 1", "1"));
        allMovies.add(new Movie("Long Title 2", 1990, "Director 2", "2"));
        allMovies.add(new Movie("Title 3", 2001, "Director 1", "1"));
        allMovies.add(new Movie("Really Long Title 1", 2005, "Long Director Name 1", "9"));
        allMovies.add(new Movie("Title 8", 2011, "Dir"));
    }

    public String listAllMovies() {
        String header = movieListingHeader();
        StringBuilder list = new StringBuilder(header);
        for (Movie movie : allMovies){
            list.append("\n").append(movie.details());
        }
        return list.toString();
    }

    private String movieListingHeader() {
        return String.format(PRINT_MOVIE_FORMAT, "Movie", "Year", "Director", "Rating");
    }
}
