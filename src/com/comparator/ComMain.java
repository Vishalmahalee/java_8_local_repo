package com.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComMain {

    public static void main(String[] args) {

        List<Movie> listMovie= new ArrayList<>();

        listMovie.add(new Movie("KGF",2017,9.2));
        listMovie.add(new Movie("Savi",2024,7.5));
        listMovie.add(new Movie("Gadar",2012,6.5));
        listMovie.add( new Movie("Fighter",2023,8.2));
        listMovie.add( new Movie("MSD",2017,9.5));

        Collections.sort(listMovie,new NameComparator());



        for (Movie movie:listMovie){

            System.out.println("Name >> "+movie.getName() +" Realised Year >> "+movie.getRealisedYear()+" Rating >>"+movie.getRating());
        }

        System.out.println();

        Collections.sort(listMovie,new YearComparator());

        for (Movie movie:listMovie){

            System.out.println("Name >> "+movie.getName() +" Realised Year >> "+movie.getRealisedYear()+" Rating >>"+movie.getRating());
        }
    }
}
