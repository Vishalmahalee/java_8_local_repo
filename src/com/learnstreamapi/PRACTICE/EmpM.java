package com.learnstreamapi.PRACTICE;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EmpM {

    public static void main(String[] args) {

        List<Emp> employees = Arrays.asList(
                new Emp("John", "Male", 25, LocalDate.of(1998, 5, 21), 50000),
                new Emp("Sarah", "Female", 30, LocalDate.of(1993, 3, 10), 70000),
                new Emp("Mark", "Male", 40, LocalDate.of(1983, 6, 18), 90000),
                new Emp("Anna", "Female", 28, LocalDate.of(1995, 8, 30), 60000),
                new Emp("Paul", "Male", 50, LocalDate.of(1973, 1, 15), 80000)
        );

        // sort on age

        employees
                .stream()
                .sorted(Comparator.comparingInt(Emp::getAge).reversed())
                .forEach(System.out::println);

        System.out.println();

        //count male &  female

        Map<String, Long> collectMaleFemale = employees
                .stream()
                .collect(Collectors.groupingBy(Emp::getGender, Collectors.counting()));

        System.out.println(collectMaleFemale);
        System.out.println();

        // find the youngest female

        employees
                .stream()
                .filter(fem -> "female".equalsIgnoreCase(fem.getGender()))
                .sorted(Comparator.comparing(Emp::getBirth).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println();

        // find the highest salary

        employees
                .stream()
                .sorted(Comparator.comparingInt(Emp::getSalary).reversed())
                .skip(1)
                .limit(1)
                .forEach(System.out::println);


    }
}
