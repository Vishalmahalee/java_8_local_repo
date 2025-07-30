package com.learnstreamapi.findemployee;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenderMain {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("John", "Male", 25, LocalDate.of(1998, 5, 21), 50000),
                new Employee("Sarah", "Female", 30, LocalDate.of(1993, 3, 10), 70000),
                new Employee("Mark", "Male", 40, LocalDate.of(1983, 6, 18), 90000),
                new Employee("Anna", "Female", 28, LocalDate.of(1995, 8, 30), 60000),
                new Employee("Paul", "Male", 50, LocalDate.of(1973, 1, 15), 80000)
        );

        // sort on age


      employees
              .stream()
                      .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                              .forEach(System.out::println);


        System.out.println();

        // count male and female

        Map<String, Long> countGender = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(countGender);

        System.out.println();

        // find the youngest female in the employee class

        Optional<Employee> first = employees
                .stream()
                .filter(gender -> "Female".equalsIgnoreCase(gender.getGender()))
                .sorted(Comparator.comparing(Employee::getBirth).reversed())
                .findFirst();

        first.ifPresent(System.out::println);

        System.out.println();
        // find the highest salary
        System.out.println("employee in descending order........");

       employees
               .stream()
                       .sorted(Comparator.comparing(Employee::getSalary).reversed())
                               .forEach(System.out::println);


        System.out.println();

        System.out.println("Highest salary from employee.....");

        employees
                .stream()
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                .findFirst()
                                        .ifPresent(System.out::println);

        System.out.println();

        // top third salary

        System.out.println("top third salary.......");

        employees
                .stream()
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                .skip(2)
                                        .limit(1)
                                                .forEach(System.out::println);
        System.out.println();

        System.out.println("skipping the first 3 element from the list");

        employees
                .stream()
                .skip(3)
                .forEach(System.out::println);

    }
}
