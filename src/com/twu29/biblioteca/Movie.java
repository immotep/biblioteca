package com.twu29.biblioteca;

import java.text.MessageFormat;

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

        String format = MessageFormat.format("%-{0}s %-{0}s %-{0}s %s", 25);
        return String.format(format, title, actor, director, rating);
    }
}
