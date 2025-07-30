package com.learnstreamapi.NUMBER;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;

public class  MaxMinSumAvgStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        IntSummaryStatistics summaryStatistics = list
                .stream()
                .mapToInt(num -> num)
                .summaryStatistics();


        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getCount());
        System.out.println(summaryStatistics.getAverage());

    }
}
