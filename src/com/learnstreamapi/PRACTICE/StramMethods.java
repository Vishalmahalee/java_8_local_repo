package com.learnstreamapi.PRACTICE;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StramMethods {

    public static void main(String[] args) {

        // filter(predicate) -> Boolean Value function
        // the predicate return boolean value that is true or false
        // if you call the filter method then predicate return the boolean value i.e true or false
        // if the predicate return the true then filter and then only filter method filter the element

      List <String> stringList= List.of("Vishal","Amardeep","Shreyas","Ayush","Akash");

      stringList.stream().filter(s -> s.endsWith("h")).forEach(System.out::println);

      List<String> startWith = stringList.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());

      System.out.println(startWith);


      //map(function)
        // It is not filter the element
        // it performs the operation on each element
        // function return the value and map take that value and return to stream

        List<Integer> listNumber= List.of(2,3,4,5,6,8);
        List<Integer> mulNumber= listNumber.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(mulNumber);

        // sorted()
        List<Integer> number = List.of(23,55,6,100,79,70,134,200);
        number.stream().sorted().forEach(System.out::println);

        // min() -> to find minimum value from list
        Integer min = number.stream().min((x,y)->x.compareTo(y)).get();

        System.out.println(min);

        // max() -> to find maximum value from list
        Integer max= number.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(max);

        // skip() method

        List<String> arr = new ArrayList<>();

        arr.add("geeks");
        arr.add("for");
        arr.add("geeks");
        arr.add("computer");
        arr.add("science");

        Stream<String> str = arr.stream();
        // calling function to skip the elements to range 3

         str.skip(3).forEach(System.out::println);
    }
}
