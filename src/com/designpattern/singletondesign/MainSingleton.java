package com.designpattern.singletondesign;

import java.lang.reflect.Constructor;

public class MainSingleton {

    public static void main(String[] args) throws Exception {

         /*
        LazySingleton singleton_1 = LazySingleton.getInstance();
        System.out.println(singleton_1.hashCode());

        LazySingleton singleton_2 = LazySingleton.getInstance();
        System.out.println(singleton_2.hashCode());


        how to break singletone
        1. By using Reflection Api: using this api we can change the class object

        How To avoid this
        there having two possibilities
        1. Don't make a new object
        2. If any request is come then it return the same object

        2 Way to avoid this
        1. If object is there => then throw the exception from inside the constructor
        2. USe enum
        */

        LazySingleton instance_1 = LazySingleton.getInstance();
        System.out.println(instance_1.hashCode());

        Constructor <LazySingleton>constructor = LazySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        LazySingleton instance_2 =constructor.newInstance();
        System.out.println(instance_2.hashCode());

    }
}
