package com.learnstreamapi.Stream_Senario_Questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ashish", "Vishal", "Nikhil", "Sakshi", "Vishal", "Samket", "Ashish");

        Map<String, Long> count = list
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(count);


        List<String> collect = count
                .entrySet()
                .stream()
                .filter(key -> key.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);

        List<String> collect1 = count
                .entrySet()
                .stream()
                .filter(val -> val.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect1);

    }
}
