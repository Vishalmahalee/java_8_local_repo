package com.basicprograms.StringsBasic;

public class SeprateTheStrChar {
    public static void main(String[] args) {
        String s ="Character";

        System.out.println("Display the separate individual character");

        System.out.println();

        System.out.println(s);

        System.out.println();

        for (int i =0 ;i<s.length(); i++){

            System.out.print(s.charAt(i)+" ");
        }
    }
}
