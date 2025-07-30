package com.designpattern.abstractfactorydesign;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 45000;
    }

    @Override
    public String name() {
        System.out.println("I am Web Client");
        return "WEB DEVELOPER";
    }
}
