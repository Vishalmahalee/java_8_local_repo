package com.learnstreamapi.STRING;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxElementFromStringList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Banana","Apple","Mango","Cherry");

        //first way Using MapToIn

        list
                .stream()
                .mapToInt(String::length)
                .max()
                .ifPresent(System.out::println);

        // Second Way To Used max and comparator

        list
                .stream()
                .max((s1,s2)->Integer.compare(s1.length(),s2.length()))
                .ifPresent(System.out::println);


    }
}
