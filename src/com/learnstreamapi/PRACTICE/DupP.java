package com.learnstreamapi.PRACTICE;

import com.multithreadingconcept.deadlock.A;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DupP {
    public static void main(String[] args) {

        String input = "Nihilent is corporate company";

        String[] split = input
                .toUpperCase()
                .replaceAll("\\s", "")
                .split("");

        Map<String, Long> collect = Arrays
                .stream(split)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect);

        collect
                .entrySet()
                .stream()
                .filter(entry ->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
