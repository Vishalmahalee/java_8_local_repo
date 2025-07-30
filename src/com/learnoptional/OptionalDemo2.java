package com.learnoptional;

import java.util.Optional;

public class OptionalDemo2 {

    private static String name="Optional object";
    public static Optional<String> getName(){

        Optional<String> name1 = Optional.ofNullable(name);
        return name1;
    }
    public static void main(String[] args) {

        Optional<String> result = getName();
        System.out.println(result.orElse("Null value is present"));
    }
}
