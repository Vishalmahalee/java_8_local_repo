package com.multithreadingconcept.deadlock;

public class A {

    public synchronized void d1(B b){
        System.out.println("Thread 1 start the execution of d1() method");

        try {
            Thread.sleep(6000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Thread 1 trying to call the B last () method");
        b.last();
    }

    public synchronized void last(){
        System.out.println("Inside the A this is the last method");
    }
}
