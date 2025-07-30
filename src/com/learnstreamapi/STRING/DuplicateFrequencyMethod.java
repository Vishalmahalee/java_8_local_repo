package com.learnstreamapi.STRING;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateFrequencyMethod {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ashish", "Vishal", "Nikhil", "Sakshi", "Vishal", "Samket", "Ashish");
        Set<String> collectDuplicates = list
                .stream()
                .filter(name -> Collections.frequency(list, name) > 1)
                .collect(Collectors.toSet());
        System.out.println(collectDuplicates);

    }
}
