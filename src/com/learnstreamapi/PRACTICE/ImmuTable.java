package com.learnstreamapi.PRACTICE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class ImmuTable {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 34, 5, 6, 7, 8, 9, 10);

        List<String> collect = list
                .stream()
                .map(num -> num + "")
                .filter(number -> number.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(collect);

        int evenSum = list
                .stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(evenSum);

        int oddSum = list
                .stream()
                .filter(oddNumber -> oddNumber % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        int odd = oddSum;

        System.out.println(oddSum);

    }
}
