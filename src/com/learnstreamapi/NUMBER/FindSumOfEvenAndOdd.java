package com.learnstreamapi.NUMBER;

import java.util.Arrays;
import java.util.List;

public class FindSumOfEvenAndOdd {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 34, 5, 6, 7, 8, 9, 10);


        int sumOfEvenNumber = number
                .stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        int sumOdOddNumber = number
                .stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("sum of even number "+ sumOfEvenNumber);
        System.out.println("sum of odd number "+sumOfEvenNumber);

    }

}
