package com.designpattern.factoryDesing;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {

        System.out.println("getting web developer salary......");

        return 50000;
    }
}
