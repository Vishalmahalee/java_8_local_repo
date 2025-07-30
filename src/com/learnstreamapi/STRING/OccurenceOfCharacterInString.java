package com.learnstreamapi.STRING;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfCharacterInString {
    public static void main(String[] args) {

        String str ="Nihilent is corporate company";

        String[] split = str.toUpperCase().replaceAll("\\s", "").split("");

        Map<String, Long> collect = Arrays
                .stream(split)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);


        collect
                .entrySet()
                .stream()
                .forEach(occurrence -> System.out.println(occurrence.getKey()+"  "+ occurrence.getValue()));
    }
}
