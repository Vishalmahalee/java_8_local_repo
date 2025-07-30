package com.learnstreamapi.STRING;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateByHashMap {

    public static void main(String[] args) {
        List<String> listName = Arrays.asList("Ashish", "Vishal", "Nikhil", "Sakshi", "Vishal", "Samket", "Ashish");
        Set<String> uniqueName = new HashSet<>();

        List<String> duplicateName = listName
                .stream()
                .filter(name -> !uniqueName.add(name))
                .collect(Collectors.toList());

        System.out.println(duplicateName);
        System.out.println(uniqueName);

    }
}
