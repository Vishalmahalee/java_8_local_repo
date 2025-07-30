package com.learnstreamapi.NUMBER;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6, 7);

        List<Integer> collect = numbers
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
