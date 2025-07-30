package com.learnlambda.practice;

import java.util.Comparator;

public class MainDemo {
    public static void main(String[] args) {

        Addition addition=(a,b)->{

            int addNum=a+b;
            int mulNum=a*b;
            System.out.println("Addition       "+ addNum);
            System.out.println("Multiplication "+mulNum);
        };

        addition.add(12,23);
    }
}
