package com.learnstreamapi.PRACTICE;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoPractice {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ashish", "Vishal", "Nikhil", "Sakshi", "Vishal", "Samket", "Ashish");

        Map<String, Long> freq = list
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        freq
                .entrySet()
                .stream()
                .forEach(entry -> System.out.println( entry.getKey() +" "+entry.getValue()));


    }
}
