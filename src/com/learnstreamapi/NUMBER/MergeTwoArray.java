package com.learnstreamapi.NUMBER;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {

    public static void main(String[] args) {

        // Traditional way to sort element

        int [] arr1={1,2,3,4,5};
        int [] arr2 ={9,8,7,6};

        int [] mergeArray = new int[arr1.length+arr2.length];

        System.arraycopy(arr1,0,mergeArray,0,arr1.length);
        System.arraycopy(arr2,0,mergeArray,arr1.length,arr2.length);
        Arrays.sort(mergeArray);


        int[] merg = IntStream
                .concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(merg));

    }
}
