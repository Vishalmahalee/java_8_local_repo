package com.learnstreamapi.Stream_Senario_Questions;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMain {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", LocalDate.of(1995, 5, 15), "Female"),
                new Employee(2, "Bob", LocalDate.of(1990, 8, 21), "Male"),
                new Employee(3, "Carol", LocalDate.of(2000, 11, 10), "Female"),
                new Employee(4, "Diana", LocalDate.of(1998, 3, 23), "Female")
        );

        Optional<Employee> youngestFemale =
                employees
                        .stream()
                                .filter(emp->"female".equalsIgnoreCase(emp.getGender()))
                                        .sorted(Comparator.comparing(Employee::getBirth).reversed())
                                                .findFirst();

        youngestFemale.ifPresent(System.out::println);




    }
}
