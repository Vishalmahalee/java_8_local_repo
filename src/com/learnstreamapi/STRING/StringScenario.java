package com.learnstreamapi.STRING;

public class StringScenario {
    public static void main(String[] args) {

        String s1 = new String("velocity");
        String s2 = new String("pune");
        s2 = s1;

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


    }
}
