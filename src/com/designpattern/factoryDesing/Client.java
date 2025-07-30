package com.designpattern.factoryDesing;

public class Client {

    public static void main(String[] args) {

        Employee androidDeveloper = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        int androidDeveloperSalary = androidDeveloper.salary();
        System.out.println(androidDeveloperSalary);

        Employee webDeveloper = EmployeeFactory.getEmployee("WEB DEVELOPER");
        int weDeveloperSalary = webDeveloper.salary();
        System.out.println(weDeveloperSalary);

    }
}
