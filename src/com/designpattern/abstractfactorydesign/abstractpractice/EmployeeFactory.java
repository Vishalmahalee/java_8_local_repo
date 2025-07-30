package com.designpattern.abstractfactorydesign.abstractpractice;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory abstractFactory) {
        return abstractFactory.createEmployee();
    }
}
