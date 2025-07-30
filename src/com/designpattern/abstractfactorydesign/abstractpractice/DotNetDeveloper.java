package com.designpattern.abstractfactorydesign.abstractpractice;

public class DotNetDeveloper implements Employee{
    @Override
    public int getSalary() {
        return 45000;
    }

    @Override
    public String getName() {
        System.out.println("I am Dot Net Developer");
        return "DOT_NET_DEVELOPER ";
    }
}
