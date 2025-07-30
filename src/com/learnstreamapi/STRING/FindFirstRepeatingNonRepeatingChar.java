package com.learnstreamapi.STRING;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatingNonRepeatingChar {
    public static void main(String[] args) {

        String str = "See g z Java code Threads";

        String[] split = str
                .toUpperCase()
                .replaceAll("\\s", "")
                .split("");



        Map<String, Long> countFrequency = Arrays
                .stream(split)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));

        System.out.println(countFrequency);

        System.out.println();

        System.out.println("Finding the first repeating character in the string");

        Optional<String> firstRepeatingChar = countFrequency
                .entrySet()
                .stream()
                .filter(ch -> ch.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst();

        firstRepeatingChar.ifPresent(System.out::println);

        System.out.println();

        System.out.println("Finding first non repeating character in string");

        Optional <String> firstNonRepeatingCh = countFrequency
                .entrySet()
                .stream()
                .filter(ch -> ch.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();

        firstNonRepeatingCh.ifPresent(System.out::println);



    }
}
