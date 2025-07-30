package com.designpattern.factoryDesing.fact_practice;

public class AndDev implements Dev{
    @Override
    public int salary() {
        System.out.println("Android dev salary is ......");
        return 45000;
    }
}
