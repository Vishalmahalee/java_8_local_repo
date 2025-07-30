package com.learnstreamapi.STRING;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ChechString {

    public static void main(String[] args) {

        String str ="Nihilent is corporate company";

        System.out.println(str);

        // occurrence of each element

        System.out.println("frequency of element............");

        String[] split = str
                .toUpperCase()
                .replaceAll("\\s","")
                .split("");


        Map<String, Long> collect = Arrays.
                stream(split)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);


        // duplicate element
        System.out.println();

        System.out.println("Duplicate element in string........");
        List<String> duplicateElement = Arrays
                .stream(split)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(dup -> dup.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(duplicateElement);
        System.out.println();

        // find first repeated and non-repeated element in string


        LinkedHashMap<String, Long> collect1 = Arrays
                .stream(split)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect1);

        Optional<String> firstRepeated = collect1
                .entrySet()
                .stream()
                .filter(firstReap -> firstReap.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(firstRepeated);

        System.out.println();

        // first non repeated element

        Optional<String> nonRepeatedChar = Arrays
                .stream(split)
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(firstNonReap -> firstNonReap.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(nonRepeatedChar);
    }
}
