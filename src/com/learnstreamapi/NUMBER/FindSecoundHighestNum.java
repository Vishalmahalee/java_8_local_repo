package com.learnstreamapi.NUMBER;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FindSecoundHighestNum {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 44, 5, 67, 777, 89, 89,88 );

        list
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                        .forEach(System.out::println);

       // System.out.println(limit);
    }
}
