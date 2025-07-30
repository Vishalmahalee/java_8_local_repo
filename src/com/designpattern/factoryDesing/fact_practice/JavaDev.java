package com.designpattern.factoryDesing.fact_practice;

public class JavaDev implements Dev{
    @Override
    public int salary() {
        System.out.println("Java Developer salary is...........");
        return 60000;
    }
}
