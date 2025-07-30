package com.designpattern.abstractfactorydesign;

public class Client {

    public static void main(String[] args) {

        // I want to get Android developer

        Employee androidEmployee = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        System.out.println(androidEmployee.name()+ "  "+ androidEmployee.salary());

        Employee webEmployee = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        System.out.println(webEmployee.name() +"  "+ webEmployee.salary());


        Employee managerEmployee = EmployeeFactory.getEmployee(new ManagerFactory());

        managerEmployee.name();
    }
}
