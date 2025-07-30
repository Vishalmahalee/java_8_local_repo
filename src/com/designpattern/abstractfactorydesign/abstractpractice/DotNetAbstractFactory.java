package com.designpattern.abstractfactorydesign.abstractpractice;

public class DotNetAbstractFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new DotNetDeveloper();
    }
}
