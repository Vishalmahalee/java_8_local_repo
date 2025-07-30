package com.multithreadingconcept.deadlock;

public class B {

    public synchronized void d2(A a){

        System.out.println("Thread 2 trying to call the d2 () method");

        try {
            Thread.sleep(6000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Thread 2 trying to call the B last() method");

        a.last();
    }
    public synchronized void last(){
        System.out.println("Inside the b this is the last method");
    }
}
