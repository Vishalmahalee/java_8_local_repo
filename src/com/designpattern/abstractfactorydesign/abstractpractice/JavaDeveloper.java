package com.designpattern.abstractfactorydesign.abstractpractice;

public class JavaDeveloper implements Employee{
    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public String getName() {

        System.out.println("I am java developer");
        return "JAVA_DEVELOPER";
    }
}
