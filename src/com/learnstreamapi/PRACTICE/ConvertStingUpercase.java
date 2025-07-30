package com.learnstreamapi.PRACTICE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// convert the string to uppercase and join with them comma
public class ConvertStingUpercase {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "kiwi", "pear");
        String collect =
                fruits
                        .stream()
                        .map(name -> name.toUpperCase())
                        .collect(Collectors.joining(",  "));

        System.out.println(collect);
    }
}
