package com.learnstreamapi.NUMBER;

import java.util.HashMap;
import java.util.stream.IntStream;

public class MissingNumberStream {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};
        int n = 6; // Assume the range is 1 to n

        // Calculate the total sum from 1 to n
        int expectedSum = IntStream.rangeClosed(1, n).sum();

        // Calculate the actual sum of the array
        int actualSum = IntStream.of(array).sum();

        // Find the missing number
        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number is: " + missingNumber);
    }
}

