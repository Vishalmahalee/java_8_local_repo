package com.designpattern.singletondesign.practice;

public class MainThreadsSafe {

    public static void main(String[] args) {

        LazyThreadInsta singletonObject = LazyThreadInsta.createSingletonObject();

        System.out.println(singletonObject.hashCode());

        LazyThreadInsta singletonObject1 = LazyThreadInsta.createSingletonObject();
        System.out.println(singletonObject1.hashCode());

    }
}
