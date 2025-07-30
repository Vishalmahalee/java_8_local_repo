package com.learnoptional;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        String [] str = new String[10];
        str[5]="Vishal";

        Optional<String> optional = Optional.ofNullable(str[5]);

        if(optional.isPresent()){
            System.out.println("data is present "+optional.get());
        }else {
            System.out.println("data is not present");
        }
    }
}
