package com.learnstreamapi.NUMBER;

import java.util.Arrays;
import java.util.Comparator;

//In Java, I have a String str = "ILoveIndia,Abc:1234". Please help me write a program using
// Stream where the program divides the string into smaller strings if there are any characters
// other than alphabets or numbers. Also the program tells you which is the largest string
// from the smaller strings.
public class StringSplit {
    public static void main(String[] args) {
        String str = "ILoveIndia,Abc:1234";

        String[] split = str
                .split("[^a-zA-Z0-9]+");

        System.out.println("smaller String");

        Arrays
                .stream(split)
                .forEach(System.out::println);

        String s = Arrays
                .stream(split)
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(s);

    }
}
