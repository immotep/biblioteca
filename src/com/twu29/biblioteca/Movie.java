package com.twu29.biblioteca;

public class Movie {
    private final String title;
    private final String actor;
    private final String director;
    private final String rating;

    public Movie(String title, String actor, String director) {
        this(title, actor, director, "N/A");
    }

    public Movie(String title, String actor, String director, String rating) {
        this.title = title;
        this.actor = actor;
        this.director = director;
        this.rating = rating;
    }

    public String details() {
        return String.format(MovieCatalog.PRINT_MOVIE_FORMAT, title, actor, director, rating);
    }
}
