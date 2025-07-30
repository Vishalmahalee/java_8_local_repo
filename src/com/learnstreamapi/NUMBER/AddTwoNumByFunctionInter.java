package com.learnstreamapi.NUMBER;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class AddTwoNumByFunctionInter {

    public static void main(String[] args) {

        int [] arr ={10,20};

        Function<int[],Integer> function = (number)->number[0]+number[1];

        Integer apply = function.apply(arr);

        System.out.println(apply);
    }
}
