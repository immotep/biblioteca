package com.twu29.biblioteca;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class MovieCatalog {
    
    private List<Movie> allMovies = new ArrayList<Movie>();

    public MovieCatalog() {
        createAllMovies();
    }

    private void createAllMovies() {
        allMovies.add(new Movie("Title 1", "Actor 1", "Director 1", "1"));
        allMovies.add(new Movie("Long Title 2", "Actor 2", "Director 2", "2"));
        allMovies.add(new Movie("Title 3", "Actor Name 3", "Director 1", "1"));
        allMovies.add(new Movie("Really Long Title 1", "Actor 1", "Long Director Name 1", "9"));
        allMovies.add(new Movie("Title 8", "Really Long Actor Name", "Dir"));
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
        String format = MessageFormat.format("%-{0}s %-{0}s %-{0}s %s", 25);
        return String.format(format, "Movie", "Name", "Director", "Rating");
    }
}
