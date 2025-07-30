package com.learnlambda;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        int [] a= {1,2,3,4,5};
        Arrays.stream(a).skip(2).forEach(System.out::println);
    }
}
