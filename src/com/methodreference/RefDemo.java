package com.methodreference;

import com.methodreference.Stuff;
import com.methodreference.WorkInter;

public class RefDemo {

    public static void main(String[] args) {

        System.out.println("Learning method reference");

        // humane jo stuff me method write ki hai usaki implementation deni hai to method reference dena hai
        // we are referencing static method so below syntax we need to used
        // className::MethodName
        WorkInter workInter = Stuff::doStuff;
        workInter.doTask();

        Runnable runnable = Stuff::threadTask;
        Thread thread = new Thread(runnable);
        thread.start();

        // Nonstatic method Reference
        // Need to create the object that class and referring that nonstatic method
        // object::method name

        Stuff stuff = new Stuff();
        Runnable runnable1 = stuff::printNumber;

        Thread thread1 = new Thread(runnable1);
        thread1.start();

        // here we are providing the implementation of the Work Interrface by providing the reference of
        // Stuff method so , here we need remember one thing the Argument show;d be same fo the both method
        // Means the argument of interface method and referencing class method should be same
        // you can have different return type
    }
}
