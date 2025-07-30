package com.learnstreamapi.PRACTICE;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstStreamDemo {

    public static void main(String[] args) {
         /*First way to create the list
         List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
         list.add(34);
        but in this case we can t modified the list it gives exception at run time*/

        //Second way to create List

        List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 910);

        /*list.add(300);
        in this case also we can't modified the list it gives exception at run time*/

        /*
        List<Integer> oddList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.);
        System.out.println(list);
        System.out.println(oddList);*/
        list.stream().filter(i -> i % 2 == 0).forEach(i-> System.out.println(i));

        List<Integer> list2 = List.of(1,2,3,4,5,6,7,8,9,5,2,4,7);
        Map<Integer, Long> collect = list2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.entrySet().stream().forEach(integerLongEntry -> System.out.println(integerLongEntry.getKey()+" "+ integerLongEntry.getValue()));


        Integer reduce = list
                .stream()
                .reduce(0, (a, b) -> a + b);

    }
}
