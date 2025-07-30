package com.learnstreamapi.PRACTICE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        // 1 way to create blank stream
        Stream<Object> emptyStram = Stream.empty();


        // 2 way if you have an array , object and collection object
        String [] name = {"vishal","Amardeep","Shreyas","Asish"};

        Stream<String> stream1=Stream.of(name);

        stream1.forEach(i-> {
            System.out.println(i);
        });

        // 3rd way By using builder
        Stream <Object> streamBuildr=Stream.builder().build();

        // 4 way By using Array

        IntStream stream4 = Arrays.stream(new int []{1,2,3,4,5,6,7,8,9});

        stream4.forEach(a->{
            System.out.println(a);
        });

        // List ,set

        List<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);

        Stream<Integer> stream5 = list.stream();
        stream5.forEach(st -> {
            System.out.println(st);
        });

    }
}
