package com.learnstreamapi.findemployee;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class EmpDeptMain {
    public static void main(String[] args) {

        List<EmpDept> empDept = Arrays.asList(
                new EmpDept("John", "Male", 25, LocalDate.of(1998, 5, 21), 50000),
                new EmpDept("Sarah", "Female", 30, LocalDate.of(1993, 3, 10), 70000),
                new EmpDept("Mark", "Male", 40, LocalDate.of(1983, 6, 18), 90000),
                new EmpDept("Anna", "Female", 28, LocalDate.of(1995, 8, 30), 60000),
                new EmpDept("Paul", "Male", 50, LocalDate.of(1973, 1, 15), 80000)
        );

        // sort on age
        empDept
                .stream()
                .sorted(Comparator.comparing(EmpDept::getBirth).reversed())
                .forEach(System.out::println);

        System.out.println("sorted on age");
        System.out.println();
        // find the youngest female in the employee class

        System.out.println("the youngest female in the employee class");
        Optional<EmpDept> first = empDept
                .stream()
                .filter(fem -> "female".equalsIgnoreCase(fem.getGender()))
                .sorted(Comparator.comparing(EmpDept::getBirth).reversed()).findFirst();

        first.ifPresent(System.out::println);

        System.out.println();
        // count male and female

        System.out.println("count male and female");

        Map<String, Long> collect = empDept
                .stream()
                .collect(Collectors.groupingBy(EmpDept::getGender, Collectors.counting()));
        System.out.println(collect);
        System.out.println();
        // find the highest salary

        System.out.println("find the highest salary");

        empDept
                .stream()
                .sorted(Comparator.comparing(EmpDept::getSalary).reversed())
                .findFirst().ifPresent(System.out::println);
        System.out.println();
        // find the 2nd highest salary

        System.out.println("find the 2nd highest salary");

        empDept
                .stream()
                .sorted(Comparator.comparing(EmpDept::getSalary).reversed())
                .skip(1)
                .limit(1).forEach(System.out::println);
    }
}
