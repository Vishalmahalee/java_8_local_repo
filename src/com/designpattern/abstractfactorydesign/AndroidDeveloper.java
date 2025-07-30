package com.designpattern.abstractfactorydesign;


public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        System.out.println("I am Android Client..........");
        return "ANDROID DEVELOPER";
    }
}
