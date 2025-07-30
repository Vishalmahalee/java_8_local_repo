package com.learnstreamapi.NUMBER;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//I Love India; I stay in Maharashtra/ Airoli"
//Split the string by ; and /
//And find the count of the frequency of each character in every split string
public class SplitString {

    public static void main(String[] args) {
        String s="I Love India; I stay in Maharashtra/ Airoli";

        String[] split = s.toUpperCase().split("[;/]");


        Arrays
                .stream(split)
                .map(String::trim)
                .forEach(subStr-> {System.out.println("subtring  "+subStr);

                    Map<Character, Long> collect = subStr
                            .chars()
                            .mapToObj(c -> (char)c)
                            .filter(c->c!=' ')
                            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

                    collect
                            .forEach((ch,count)-> System.out.println("'" + ch + "' -> " + count));

                });
    }
}
