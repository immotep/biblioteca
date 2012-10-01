package com.twu29.biblioteca;

public class Movie {
    private final String title;
    private final int year;
    private final String director;
    private final String rating;

    public Movie(String title, int year, String director) {
        this(title, year, director, "N/A");
    }

    public Movie(String title, int year, String director, String rating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String details() {
        return String.format(MovieCatalog.PRINT_MOVIE_FORMAT, title, year, director, rating);
    }
}
