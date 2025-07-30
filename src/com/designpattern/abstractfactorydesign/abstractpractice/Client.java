package com.designpattern.abstractfactorydesign.abstractpractice;

public class Client {

    public static void main(String[] args) {
        Employee employee_1 = EmployeeFactory.getEmployee(new JavaDevAbstractFactory());

        employee_1.getName();
        System.out.println(employee_1.getSalary());

        Employee employee_2 = EmployeeFactory.getEmployee(new DotNetAbstractFactory());
        employee_2.getName();
        System.out.println(employee_2.getSalary());
    }
}
