package com.designpattern.abstractfactorydesign.abstractpractice;

public class JavaDevAbstractFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new JavaDeveloper();
    }
}
