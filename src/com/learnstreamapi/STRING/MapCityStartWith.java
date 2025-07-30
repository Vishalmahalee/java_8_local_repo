package com.learnstreamapi.STRING;

import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

public class MapCityStartWith {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Pune");
        hashMap.put(2, "Delhi");
        hashMap.put(3, "Mumbai");
        hashMap.put(4, "Nagpur");

        // Filter cities that end with vowels
        Map<Integer, String> filteredMap = hashMap.entrySet().stream()
                .filter(entry -> entry.getValue().matches(".*[AEIOUaeiou]$"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Print the filtered map
        System.out.println(filteredMap);
    }
}
