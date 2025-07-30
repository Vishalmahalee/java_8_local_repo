package com.learnstreamapi.NUMBER;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicateMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Apple");
        map.put(4, "Orange");
        map.put(5, "Banana");

        Map<Integer, String> mapWithoutDuplicates = map.entrySet()
                .stream()
                .filter(entry -> map.entrySet().stream()
                        .filter(e -> e.getValue().equals(entry.getValue()))
                        .count() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Print the result
        System.out.println("HashMap without duplicates: " + mapWithoutDuplicates);

    }
}
