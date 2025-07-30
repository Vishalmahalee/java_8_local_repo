package com.multithreadingconcept.synchronization;

public class Display {

    public synchronized void wish(String name) throws InterruptedException {

        for (int i =0 ;i<5 ;i++){
            System.out.print("Good Morning: ");
            Thread.sleep(1000);
            System.out.println(name);

        }
    }
}
