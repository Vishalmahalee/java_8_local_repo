package com.learnstreamapi.NUMBER;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// print 2 and 3 element from descending order
public class PrintSecondAndThirdElement {

    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(100,23,23,200,19,44,2,1);

        List<Integer> sort = num
                .stream()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> secondAndThird =
                sort
                        .stream()
                        .skip(1)
                        .limit(2)
                        .collect(Collectors.toList());
        System.out.println(secondAndThird);

        List<Integer> collect = num.stream().sorted().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(collect);
    }
}
