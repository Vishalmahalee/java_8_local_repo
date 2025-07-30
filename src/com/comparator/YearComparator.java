package com.comparator;

import java.util.Comparator;

public class YearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        if (movie1.getRealisedYear()==movie2.getRealisedYear())
            return 0;
        else if (movie1.getRealisedYear() > movie2.getRealisedYear())
            return 1;
        else
            return -1;
    }
}
