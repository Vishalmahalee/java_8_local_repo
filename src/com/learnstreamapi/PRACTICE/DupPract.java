package com.learnstreamapi.PRACTICE;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DupPract {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Apple");
        map.put(4, "Orange");
        map.put(5, "Banana");

        Map<Integer, String> collect = map
                .entrySet()
                .stream()
                .filter(entry -> map
                        .entrySet()
                        .stream()
                        .filter(ch -> ch.getValue().equals(entry.getValue())).count() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(collect);
    }
}
