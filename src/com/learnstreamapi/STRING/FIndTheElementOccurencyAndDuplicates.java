package com.learnstreamapi.STRING;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FIndTheElementOccurencyAndDuplicates {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ashish", "Vishal", "Nikhil", "Sakshi", "Vishal", "Samket", "Ashish");

        Map<String, Long> frequencyOfElement =

                list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequencyOfElement);

        frequencyOfElement
                .entrySet()
                .stream()
                .forEach(interLongentry-> System.out.println(interLongentry.getKey()+" "+ interLongentry.getValue()));


        //find duplicates

        Set<String> collectDuplicates = frequencyOfElement
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(collectDuplicates);


        List<Integer> number = Arrays.asList(1,2,3,4,5,6,33,55,11,6,33,100,345);


        IntSummaryStatistics summary =
                number
                        .stream()
                        .mapToInt(num -> num)
                        .summaryStatistics();
        System.out.println(summary.getMax());
        System.out.println(summary.getMin());

    }

}