package com.learnstreamapi.PRACTICE;

import java.util.Arrays;
import java.util.List;

public class SortedTheElement {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(100,23,23,200,19,44,2,1);
        num.stream().sorted().forEach(System.out::println);
    }
}
