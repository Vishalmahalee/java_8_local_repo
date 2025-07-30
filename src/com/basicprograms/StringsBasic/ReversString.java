package com.basicprograms.StringsBasic;

public class ReversString {

    public static void main(String[] args) {

        String name="vishal";

        String revers="";

        for (int i =name.length()-1; i>=0 ; i--){

            revers=revers+name.charAt(i);
        }

        System.out.println("Original String  : "+name);
        System.out.println("Revers   String  : "+revers);
    }
}
