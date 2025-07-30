package com.designpattern.factoryDesing.fact_practice;

public class DevClient {

    public static void main(String[] args) {

        Dev androidDev = DevFactory.getDevObject(" dev");
        System.out.println(androidDev.salary());

        Dev javaDev = DevFactory.getDevObject("Java Dev");
        System.out.println(javaDev.salary());
    }
}
