package com.learnstreamapi.STRING;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateStringByStream {

    public static void main(String[] args) {
        String str ="Nihilent is corporate company";

        String[] split = str
                .toUpperCase()
                .replaceAll("\\s", "")
                .split("");

        // Frequency of an element
        Map<String, Long> collect = Arrays
                .stream(split)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

        // duplicate element

        List<String> duplicates = collect
                .entrySet()
                .stream()
                .filter(occurrence -> occurrence.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(duplicates);


        // Unique element

        List<String> uniqueElement = collect
                .entrySet()
                .stream()
                .filter(element -> element.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(uniqueElement);

        // first non-repeating element

        String nonRepeatingElement = collect
                .entrySet()
                .stream()
                .filter(letter -> letter.getValue() == 1)
                .findFirst()
                        .get()
                                .getKey();

        System.out.println(nonRepeatingElement);


    }

}
