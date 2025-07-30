package com.learnstreamapi.NUMBER;

import com.multithreadingconcept.deadlock.A;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) {

        String str ="Nihilent is corporate company";

        String[] split = str
                .toUpperCase()
                .replaceAll("//s", "")
                .split("");

        LinkedHashMap<String, Long> collect = Arrays
                .stream(split)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect);

        collect
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);



    }
}
