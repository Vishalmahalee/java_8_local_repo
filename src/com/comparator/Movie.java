package com.comparator;

import java.util.Date;

public class Movie {

    private String name;
    private int realisedYear;
    private Double rating;

    public Movie(String name, int realisedYear, Double rating) {
        this.name = name;
        this.realisedYear = realisedYear;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRealisedYear() {
        return realisedYear;
    }

    public void setRealisedYear(int realisedYear) {
        this.realisedYear = realisedYear;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", realisedYear=" + realisedYear +
                ", rating=" + rating +
                '}';
    }
}
