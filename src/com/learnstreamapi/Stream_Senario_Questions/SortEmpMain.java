package com.learnstreamapi.Stream_Senario_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpMain {

    public static void main(String[] args) {

        List<SortEmployeeSal> employee = Arrays.asList
                (new SortEmployeeSal(1, 45000),
                        new SortEmployeeSal(2, 3000),
                        new SortEmployeeSal(3, 50000),
                        new SortEmployeeSal(4, 43400),
                        new SortEmployeeSal(5, 400),
                        new SortEmployeeSal(6, 4340));

        List<SortEmployeeSal> sortedSalary = employee
                .stream()
                .sorted(Comparator.comparing(SortEmployeeSal::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println("Descending order salary ..............");

        System.out.println(sortedSalary);

        List<SortEmployeeSal> topThreeSalary = employee
                .stream()
                .sorted(Comparator.comparing(SortEmployeeSal::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(topThreeSalary);

        List<SortEmployeeSal> thirdTopSalary = employee
                .stream()
                .sorted(Comparator.comparing(SortEmployeeSal::getSalary).reversed())
                .skip(2)
                .limit(1)
                .collect(Collectors.toList());
        System.out.println(thirdTopSalary);

        List<SortEmployeeSal> fetchLessThanThirdHighestSal = employee
                .stream()
                .sorted(Comparator.comparing(SortEmployeeSal::getSalary).reversed())
                .skip(3)
                .collect(Collectors.toList());

        System.out.println(fetchLessThanThirdHighestSal);


    }
}
