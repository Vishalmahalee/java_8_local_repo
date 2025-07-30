package com.learnstreamapi.STRING;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindStringLength {

    public static void main(String[] args) {


    List<String> fruits = Arrays.asList("apple", "banana", "orange", "kiwi", "pear");

    // find the length of each element

        Map<Integer, List<String>> collect = fruits.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

        List<String> checkLength = fruits.stream().filter(x -> x.length() > 4).collect(Collectors.toList());
        System.out.println(checkLength);
    }
}
