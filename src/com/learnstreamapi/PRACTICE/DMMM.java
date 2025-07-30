package com.learnstreamapi.PRACTICE;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DMMM {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Set<Integer> set = new HashSet<>();

        myList
                .stream()
                .filter(number -> set.add(number))
                .forEach(System.out::println);

        List<Integer> collect = myList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(num -> num.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
